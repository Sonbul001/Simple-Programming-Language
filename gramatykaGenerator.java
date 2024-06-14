import java.util.Stack;

class gramatykaGenerator {
   
   static String header_text = "";
   static String main_text = "";
   static int reg = 1;
   static int str = 1;
   static int br = 0;
   static int main_tmp = 1;
   static Stack<Integer> brstack = new Stack<Integer>();
   static String buffer = "";


   static void printf_value(String id, String format, Boolean global) {
      String llvm_format;
      String type;
      switch (format) {
         case "int":
         case "boolean":
            llvm_format = "i1";
            type = "strpi";
            break;
         case "float":
            llvm_format = "float";
            type = "strpf";
            break;
         case "double":
            llvm_format = "double";
            type = "strpd";
            break;
         case "string":
            llvm_format = "i8*";
            type = "strps";
            break;
         default:
            System.err.println("Error: Invalid format: " + format);
            return;
      }
      if (global) {
         buffer += "%" + reg + " = load " + llvm_format + ", " + llvm_format + "* @" + id + "\n";
      } else {
         buffer += "%" + reg + " = load " + llvm_format + ", " + llvm_format + "* %" + id + "\n";
      }
      reg++;
      buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @"+type+", i32 0, i32 0), " + llvm_format + " %"+(reg-1)+")\n";
      reg++;
   }
   static void scanf(String id, String format, Boolean global){
      String type;
      String llvm_format;
      switch (format) {
         case "int":
            declare_int(id, global);
            type = "strsi";
            llvm_format = "i32";
            break;
         case "float":
            declare_float(id, global);
            type = "strsf";
            llvm_format = "float";
            break;
         case "double":
            declare_double(id, global);
            type = "strsd";
            llvm_format = "double";
            break;
         case "boolean":
            declare_boolean(id, global);
            type = "strsi";
            llvm_format = "i32";
            break;
         default:
            System.err.println("Error: Invalid format: " + format);
            return;
      }
      buffer += "%"+reg+" = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @"+type+", i32 0, i32 0), "+llvm_format+"* %"+id+")\n";
      reg++;
   }

   static void scanf_string(String id, int l, Boolean global) {
      allocate_string("str"+str, l);
      if( global ){
         header_text += "@"+id+" = global i8* 0\n";
      } else {
         buffer += "%"+id+" = alloca i8*\n";
      }
      buffer += "%"+reg+" = getelementptr inbounds ["+(l+1)+" x i8], ["+(l+1)+" x i8]* %str"+str+", i64 0, i64 0\n";
      reg++;
      if( global ){
         buffer += "store i8* %"+(reg-1)+", i8** @"+id+"\n";
      } else {
         buffer += "store i8* %"+(reg-1)+", i8** %"+id+"\n";
      }
      str++;
      buffer += "%"+reg+" = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @strss, i32 0, i32 0), i8* %"+(reg-1)+")\n";
      reg++;
   }

   static void declare_array(String id, int size) {
      buffer += "%" + id + " = alloca [" + size + " x i32]\n";
   }

   static void assign_array_element(String id, int size, int index, String value) {
      buffer += "%idx" + reg + " = getelementptr inbounds [" + size + " x i32], [" + size + " x i32]* %" + id + ", i32 0, i32 " + index + "\n";
      buffer += "store i32 " + value + ", i32* %idx" + reg + "\n";
      reg++;
   }

   static void load_array_element(String id, int size, int index) {
      buffer += "%idx" + reg + " = getelementptr inbounds [" + size + " x i32], [" + size + " x i32]* %" + id + ", i32 0, i32 " + index + "\n";
      buffer += "%" + reg + " = load i32, i32* %idx" + reg + "\n";
      reg++;
   }

   static void declare_int(String id, Boolean global){
      if( global ){
         header_text += "@"+id+" = global i32 0\n";
      } else {
         buffer += "%"+id+" = alloca i32\n";
      }
   }

   static void declare_string(String id, Boolean global){
      if( global ){
         header_text += "@"+id+" = global i8* 0\n";
      } else {
         buffer += "%"+id+" = alloca i8*\n";
      }
   }

   static void declare_float(String id, Boolean global){
      if( global ){
         header_text += "@"+id+" = global float 0\n";
      } else {
         buffer += "%"+id+" = alloca float\n";
      }
   }

   static void declare_double(String id, Boolean global){
      if( global ){
         header_text += "@"+id+" = global double 0\n";
      } else {
         buffer += "%"+id+" = alloca double\n";
      }
   }

   static void declare_boolean(String id, Boolean global){
      if( global ){
         header_text += "@"+id+" = global i1 0\n";
      } else {
         buffer += "%"+id+" = alloca i1\n";
      }
   }

   static void allocate_string(String id, int l){
      buffer += "%"+id+" = alloca ["+(l+1)+" x i8]\n";
   }

   static void assign_int(String id, String value, Boolean global){
      if( global ){
         buffer += "store i32 "+value+", i32* @"+id+"\n";
      } else {
         buffer += "store i32 "+value+", i32* %"+id+"\n";
      }
   }

   static void assign_float(String id, String value){
      buffer += "store float "+value+", float* %"+id+"\n";
   }

   static void assign_double(String id, String value, Boolean global){
      if( global ){
         buffer += "store double "+value+", double* @"+id+"\n";
      } else {
         buffer += "store double "+value+", double* %"+id+"\n";
      }
   }

   static void assign_boolean(String id, String value, Boolean global) {
      if( global ){
         buffer += "store i1 "+value+", i1* @"+id+"\n";
      } else {
         buffer += "store i1 "+value+", i1* %"+id+"\n";
      }
   }

   static void assign_string(String id, Boolean global){
      if( global ){
         buffer += "store i8* %"+(reg-1)+", i8** @"+id+"\n";
      } else {
         buffer += "store i8* %"+(reg-1)+", i8** %"+id+"\n";
      }
   }

   static void constant_string(String content){
      int l = content.length()+1;
      header_text += "@str"+str+" = constant ["+l+" x i8] c\""+content+"\\00\"\n";
      String n = "str"+str;
      gramatykaGenerator.allocate_string(n, (l-1));
      buffer += "%"+reg+" = bitcast ["+l+" x i8]* %"+n+" to i8*\n";
      buffer += "call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %"+reg+", i8* align 1 getelementptr inbounds (["+l+" x i8], ["+l+" x i8]* @"+n+", i32 0, i32 0), i64 "+l+", i1 false)\n";
      reg++;
      buffer += "%ptr"+n+" = alloca i8*\n";
      buffer += "%"+reg+" = getelementptr inbounds ["+l+" x i8], ["+l+" x i8]* %"+n+", i64 0, i64 0\n";
      reg++;
      buffer += "store i8* %"+(reg-1)+", i8** %ptr"+n+"\n";
      str++;
   }

   static void load_int(String id, Boolean global){
      if( global ){
         buffer += "%"+reg+" = load i32, i32* @"+id+"\n";
      } else {
         buffer += "%"+reg+" = load i32, i32* %"+id+"\n";
      }
      reg++;
   }

   static void load_float(String id){
      buffer += "%"+reg+" = load float, float* %"+id+"\n";
      reg++;
   }

   static void load_double(String id, Boolean global){
      if( global ){
         buffer += "%"+reg+" = load double, double* @"+id+"\n";
      } else {
         buffer += "%"+reg+" = load double, double* %"+id+"\n";
      }
      reg++;
   }

   static void load_boolean(String id, Boolean global){
      if( global ){
         buffer += "%"+reg+" = load i1, i1* @"+id+"\n";
      } else {
         buffer += "%"+reg+" = load i1, i1* %"+id+"\n";
      }
      reg++;
   }

   static void load_string(String id, Boolean global){
      if( global ){
         buffer += "%"+reg+" = load i8, i8* @"+id+"\n";
      } else {
         buffer += "%"+reg+" = load i8, i8* %"+id+"\n";
      }
      reg++;
   }

   static void add_int(String id1, String id2){
      buffer += "%"+reg+" = add i32 "+id1+", "+id2+"\n";
      reg++;
   }

   static void add_float(String id1, String id2){
      buffer += "%"+reg+" = fadd float "+id1+", "+id2+"\n";
      reg++;
   }

   static void add_double(String id1, String id2){
      buffer += "%"+reg+" = fadd double "+id1+", "+id2+"\n";
      reg++;
   }

   static void minus_int(String id1, String id2) {
      buffer += "%" + reg + " = sub i32 " + id1 + ", " + id2 + "\n";
      reg++;
   }

   static void minus_float(String id1, String id2) {
      buffer += "%" + reg + " = fsub float " + id1 + ", " + id2 + "\n";
      reg++;
   }

   static void minus_double(String id1, String id2) {
      buffer += "%" + reg + " = fsub double " + id1 + ", " + id2 + "\n";
      reg++;
   }

   static void mult_int(String val1, String val2){
      buffer += "%"+reg+" = mul i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void mult_float(String val1, String val2){
      buffer += "%"+reg+" = fmul float "+val1+", "+val2+"\n";
      reg++;
   }

   static void mult_double(String val1, String val2){
      buffer += "%"+reg+" = fmul double "+val1+", "+val2+"\n";
      reg++;
   }

   static void divide_int(String val1, String val2) {
      buffer += "%" + reg + " = sdiv i32 " + val2 + ", " + val1 + "\n";
      reg++;
   }

   static void divide_float(String val1, String val2) {
      buffer += "%" + reg + " = fdiv float " + val2 + ", " + val1 + "\n";
      reg++;
   }

   static void divide_double(String val1, String val2) {
      buffer += "%" + reg + " = fdiv double " + val2 + ", " + val1 + "\n";
      reg++;
   }

   static void add_string(String id1, int l1, String id2, int l2){
      allocate_string("str"+str, l1+l2);
      buffer += "%ptrstr"+str+" = alloca i8*\n";
      buffer += "%"+reg+" = getelementptr inbounds ["+(l1+l2+1)+" x i8], ["+(l1+l2+1)+" x i8]* %str"+str+", i64 0, i64 0\n";
      reg++;
      buffer += "store i8* %"+(reg-1)+", i8** %ptrstr"+str+"\n"; 
      buffer += "%"+reg+" = load i8*, i8** %ptrstr"+str+"\n";
      reg++;  
      buffer += "%"+reg+" = call i8* @strcpy(i8* %"+(reg-1)+", i8* "+id1+")\n";
      reg++;
      buffer += "%"+reg+" = call i8* @strcat(i8* %"+(reg-2)+", i8* "+id2+")\n";
      reg++;
      str++;      
   }

   static void and(String val1, String val2) {
      buffer += "br i1 " + val2 + ", label %trueandcond, label %falseandcond\n";
      reg++;
      buffer += "trueandcond:\n";
      buffer += "%" + reg + " = icmp eq i1 " + val1 + ", 1\n";
      reg++;
      buffer += "br label %exitandcond\n";
      buffer += "falseandcond:\n";
      buffer += "%" + reg + " = icmp eq i1 1, 0\n";
      reg++;
      buffer += "br label %exitandcond\n";
      buffer += "exitandcond:\n";
      buffer += "%" + reg + " = phi i1 [ %"+ (reg-2) +", %trueandcond ], [ %"+ (reg-1) +", %falseandcond ]\n";
      reg++;
   }

   static void or(String val1, String val2) { // val1->1 val2->0
      buffer += "br i1 " + val2 + ", label %truecond, label %falsecond\n";
      reg++;
      buffer += "truecond:\n";
      buffer += "%" + reg + " = icmp eq i1 1, 1\n";
      reg++;
      buffer += "br label %exitcond\n";
      buffer += "falsecond:\n";
      buffer += "%" + reg + " = icmp eq i1 " + val1 + ", 1\n";
      reg++;
      buffer += "br label %exitcond\n";
      buffer += "exitcond:\n";
      buffer += "%" + reg + " = phi i1 [ %"+ (reg-2) +", %truecond ], [ %"+ (reg-1) +", %falsecond ]\n";
      reg++;
   }

   static void xor(String val1, String val2) {
      buffer += "%" + reg + " = xor i1 " + val1 + "," + val2 + "\n";
      reg++;
   }

   static void neg(String val) {
      buffer += "%" + reg + " = xor i1 " + val + ", 1\n";
      reg++;
   }

   static void equal(String left, String right) {
      buffer += "%"+reg+" = icmp eq i32 "+left+", "+right+"\n";
      reg++;
   }

   static void notequal(String left, String right) {
      buffer += "%"+reg+" = icmp ne i32 "+left+", "+right+"\n";
      reg++;
   }

   static void bigger(String left, String right) {
      buffer += "%"+reg+" = icmp sgt i32 "+left+", "+right+"\n";
      reg++;
   }

   static void smaller(String left, String right) {
      buffer += "%"+reg+" = icmp slt i32 "+left+", "+right+"\n";
      reg++;
   }

   static void repeatstart(String repetitions){
      declare_int(Integer.toString(reg), false);
      int counter = reg;
      reg++;
      assign_int(Integer.toString(counter), "0", false);
      br++;
      buffer += "br label %cond"+br+"\n";
      buffer += "cond"+br+":\n";

      load_int(Integer.toString(counter), false);
      add_int("%"+(reg-1), "1");
      assign_int(Integer.toString(counter), "%"+(reg-1), false);

      buffer += "%"+reg+" = icmp slt i32 %"+(reg-2)+", "+repetitions+"\n";
      reg++;

      buffer += "br i1 %"+(reg-1)+", label %true"+br+", label %false"+br+"\n";
      buffer += "true"+br+":\n";
      brstack.push(br);
   }

   static void repeatend(){
      int b = brstack.pop();
      buffer += "br label %cond"+b+"\n";
      buffer += "false"+b+":\n";
   }

   static void ifCond(Integer x) {
      buffer += "br i1 %" + (reg-1) + ", label %start_block"+ x +", label %end_block" + x +"\n";
   }

   static void blockStart(Integer x) {
      buffer += "start_block" + x + ":\n";
   }

   static void blockEnd(Integer x) {
      buffer += "br label %end_block" + x + "\n";
      buffer += "end_block" + x + ":\n";
   }

//   static void functionstart(String id){
//      header_text += "define i32 @"+id+"() nounwind {\n";
//      reg++;
//   }
//
//   static void functionend(){
//      header_text += "ret i32 %"+(reg-1)+"\n";
//      header_text += "}\n";
//   }

   static void functionstart(String id){
      main_text += buffer;
      main_tmp = reg;
      buffer = "define i32 @"+id+"() nounwind {\n";
      reg = 1;
   }

   static void functionend(){
      buffer += "ret i32 %"+(reg-1)+"\n";
      buffer += "}\n";
      header_text += buffer;
      buffer = "";
      reg = main_tmp;
   }

   static void call(String id){
      buffer += "%"+reg+" = call i32 @"+id+"()\n";
      reg++;
   }

   static void close_main(){
      main_text += buffer;
   }

   static String generate(){
      String text = "";
      text += "declare i32 @printf(i8*, ...)\n";
      text += "declare i8* @strcat(i8*, i8*)\n";
      text += "declare i8* @strcpy(i8*, i8*)\n";
      text += "declare i32 @scanf(i8*, ...)\n";
      text += "declare void @llvm.memcpy.p0i8.p0i8.i64(i8* noalias nocapture writeonly, i8* noalias nocapture readonly, i64, i1 immarg)\n";
      text += "@strps = constant [4 x i8] c\"%s\\0A\\00\"\n";
      text += "@strpi = constant [4 x i8] c\"%d\\0A\\00\"\n";
      text += "@strpf = constant [4 x i8] c\"%f\\0A\\00\"\n";
      text += "@strpd = constant [5 x i8] c\"%lf\\0A\\00\"\n";
      text += "@strsi = constant [3 x i8] c\"%d\\00\"\n";
      text += "@strsf = constant [3 x i8] c\"%f\\00\"\n";
      text += "@strsd = constant [4 x i8] c\"%lf\\00\"\n";
      text += "@strss = constant [5 x i8] c\"%10s\\00\"\n";
      text += header_text;
      text += "define i32 @main() nounwind{\n";
      text += main_text;
      text += "ret i32 0 }\n";
      return text;
   }

}
