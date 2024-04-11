import java.util.Stack;

class gramatykaGenerator {
   
   static String header_text = "";
   static String main_text = "";
   static int reg = 1;
   static int str = 1;
   static int br = 0;
   static Stack<Integer> brstack = new Stack<Integer>();


   static void printf_value(String id, String format) {
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
      main_text += "%" + reg + " = load " + llvm_format + ", " + llvm_format + "* %" + id + "\n";
      reg++;
      main_text += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @"+type+", i32 0, i32 0), " + llvm_format + " %"+(reg-1)+")\n";
      reg++;
   }
   static void scanf(String id, String format){
      String type;
      String llvm_format;
      switch (format) {
         case "int":
            declare_int(id);
            type = "strsi";
            llvm_format = "i32";
            break;
         case "float":
            declare_float(id);
            type = "strsf";
            llvm_format = "float";
            break;
         case "double":
            declare_double(id);
            type = "strsd";
            llvm_format = "double";
            break;
         case "boolean":
            declare_boolean(id);
            type = "strsi";
            llvm_format = "i32";
            break;
         default:
            System.err.println("Error: Invalid format: " + format);
            return;
      }
      main_text += "%"+reg+" = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @"+type+", i32 0, i32 0), "+llvm_format+"* %"+id+")\n";
      reg++;
   }

   static void scanf_string(String id, int l) {
      allocate_string("str"+str, l);
      main_text += "%"+id+" = alloca i8*\n";
      main_text += "%"+reg+" = getelementptr inbounds ["+(l+1)+" x i8], ["+(l+1)+" x i8]* %str"+str+", i64 0, i64 0\n";
      reg++;
      main_text += "store i8* %"+(reg-1)+", i8** %"+id+"\n";
      str++;
      main_text += "%"+reg+" = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @strs, i32 0, i32 0), i8* %"+(reg-1)+")\n";
      reg++;
   }

   static void declare_array(String id, int size) {
      main_text += "%" + id + " = alloca [" + size + " x i32]\n";
   }

   static void assign_array_element(String id, int size, int index, String value) {
      main_text += "%idx" + reg + " = getelementptr inbounds [" + size + " x i32], [" + size + " x i32]* %" + id + ", i32 0, i32 " + index + "\n";
      main_text += "store i32 " + value + ", i32* %idx" + reg + "\n";
      reg++;
   }

   static void load_array_element(String id, int size, int index) {
      main_text += "%idx" + reg + " = getelementptr inbounds [" + size + " x i32], [" + size + " x i32]* %" + id + ", i32 0, i32 " + index + "\n";
      main_text += "%" + reg + " = load i32, i32* %idx" + reg + "\n";
      reg++;
   }

   static void declare_int(String id){
      main_text += "%"+id+" = alloca i32\n";
   }

   static void declare_string(String id){ main_text += "%"+id+" = alloca i8*\n"; }

   static void declare_float(String id){ main_text += "%"+id+" = alloca float\n"; }

   static void declare_double(String id){ main_text += "%"+id+" = alloca double\n"; }

   static void declare_boolean(String id){ main_text += "%"+id+" = alloca i1\n"; }

   static void allocate_string(String id, int l){
      main_text += "%"+id+" = alloca ["+(l+1)+" x i8]\n";
   }

   static void assign_int(String id, String value){
      main_text += "store i32 "+value+", i32* %"+id+"\n";
   }

   static void assign_float(String id, String value){
      main_text += "store float "+value+", float* %"+id+"\n";
   }

   static void assign_double(String id, String value){
      main_text += "store double "+value+", double* %"+id+"\n";
   }

   static void assign_boolean(String id, String value) {
      main_text += "store i1 " + value + ", i1* %" + id + "\n";
   }

   static void assign_string(String id){  
      main_text += "store i8* %"+(reg-1)+", i8** %"+id+"\n";
   }

   static void constant_string(String content){
      int l = content.length()+1;
      header_text += "@str"+str+" = constant ["+l+" x i8] c\""+content+"\\00\"\n";
      String n = "str"+str;
      gramatykaGenerator.allocate_string(n, (l-1));
      main_text += "%"+reg+" = bitcast ["+l+" x i8]* %"+n+" to i8*\n";
      main_text += "call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %"+reg+", i8* align 1 getelementptr inbounds (["+l+" x i8], ["+l+" x i8]* @"+n+", i32 0, i32 0), i64 "+l+", i1 false)\n";
      reg++;
      main_text += "%ptr"+n+" = alloca i8*\n";
      main_text += "%"+reg+" = getelementptr inbounds ["+l+" x i8], ["+l+" x i8]* %"+n+", i64 0, i64 0\n";
      reg++;
      main_text += "store i8* %"+(reg-1)+", i8** %ptr"+n+"\n";
      str++;
   }

   static void load_int(String id){
      main_text += "%"+reg+" = load i32, i32* %"+id+"\n";
      reg++;
   }

   static void load_float(String id){
      main_text += "%"+reg+" = load float, float* %"+id+"\n";
      reg++;
   }

   static void load_double(String id){
      main_text += "%"+reg+" = load double, double* %"+id+"\n";
      reg++;
   }

   static void load_boolean(String id){
      main_text += "%"+reg+" = load i1, i1* %"+id+"\n";
      reg++;
   }

   static void load_string(String id){
      main_text += "%"+reg+" = load i8*, i8** %"+id+"\n";
      reg++;
   }

   static void add_int(String id1, String id2){
      main_text += "%"+reg+" = add i32 "+id1+", "+id2+"\n";
      reg++;
   }

   static void add_float(String id1, String id2){
      main_text += "%"+reg+" = fadd float "+id1+", "+id2+"\n";
      reg++;
   }

   static void add_double(String id1, String id2){
      main_text += "%"+reg+" = fadd double "+id1+", "+id2+"\n";
      reg++;
   }

   static void minus_int(String id1, String id2) {
      main_text += "%" + reg + " = sub i32 " + id1 + ", " + id2 + "\n";
      reg++;
   }

   static void minus_float(String id1, String id2) {
      main_text += "%" + reg + " = fsub float " + id1 + ", " + id2 + "\n";
      reg++;
   }

   static void minus_double(String id1, String id2) {
      main_text += "%" + reg + " = fsub double " + id1 + ", " + id2 + "\n";
      reg++;
   }

   static void mult_int(String val1, String val2){
      main_text += "%"+reg+" = mul i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void mult_float(String val1, String val2){
      main_text += "%"+reg+" = fmul float "+val1+", "+val2+"\n";
      reg++;
   }

   static void mult_double(String val1, String val2){
      main_text += "%"+reg+" = fmul double "+val1+", "+val2+"\n";
      reg++;
   }

   static void divide_int(String val1, String val2) {
      main_text += "%" + reg + " = sdiv i32 " + val2 + ", " + val1 + "\n";
      reg++;
   }

   static void divide_float(String val1, String val2) {
      main_text += "%" + reg + " = fdiv float " + val2 + ", " + val1 + "\n";
      reg++;
   }

   static void divide_double(String val1, String val2) {
      main_text += "%" + reg + " = fdiv double " + val2 + ", " + val1 + "\n";
      reg++;
   }

   static void add_string(String id1, int l1, String id2, int l2){
      allocate_string("str"+str, l1+l2);
      main_text += "%ptrstr"+str+" = alloca i8*\n";
      main_text += "%"+reg+" = getelementptr inbounds ["+(l1+l2+1)+" x i8], ["+(l1+l2+1)+" x i8]* %str"+str+", i64 0, i64 0\n";
      reg++;
      main_text += "store i8* %"+(reg-1)+", i8** %ptrstr"+str+"\n"; 
      main_text += "%"+reg+" = load i8*, i8** %ptrstr"+str+"\n";
      reg++;  
      main_text += "%"+reg+" = call i8* @strcpy(i8* %"+(reg-1)+", i8* "+id1+")\n";
      reg++;
      main_text += "%"+reg+" = call i8* @strcat(i8* %"+(reg-2)+", i8* "+id2+")\n";
      reg++;
      str++;      
   }

   static void and(String val1, String val2) {
      main_text += "br i1 " + val2 + ", label %truecond, label %falsecond\n";
      reg++;
      main_text += "truecond:\n";
      main_text += "%" + reg + " = icmp eq i1 " + val1 + ", 1\n";
      reg++;
      main_text += "br label %exitcond\n";
      main_text += "falsecond:\n";
      main_text += "%" + reg + " = icmp eq i1 1, 0\n";
      reg++;
      main_text += "br label %exitcond\n";
      main_text += "exitcond:\n";
      main_text += "%" + reg + " = phi i1 [ %"+ (reg-2) +", %truecond ], [ %"+ (reg-1) +", %falsecond ]\n";
      reg++;
   }

   static void or(String val1, String val2) { // val1->1 val2->0
      main_text += "br i1 " + val2 + ", label %truecond, label %falsecond\n";
      reg++;
      main_text += "truecond:\n";
      main_text += "%" + reg + " = icmp eq i1 1, 1\n";
      reg++;
      main_text += "br label %exitcond\n";
      main_text += "falsecond:\n";
      main_text += "%" + reg + " = icmp eq i1 " + val1 + ", 1\n";
      reg++;
      main_text += "br label %exitcond\n";
      main_text += "exitcond:\n";
      main_text += "%" + reg + " = phi i1 [ %"+ (reg-2) +", %truecond ], [ %"+ (reg-1) +", %falsecond ]\n";
      reg++;
   }

   static void xor(String val1, String val2) {
      main_text += "%" + reg + " = xor i1 " + val1 + "," + val2 + "\n";
      reg++;
   }

   static void neg(String val) {
      main_text += "%" + reg + " = xor i1 " + val + ", 1\n";
      reg++;
   }

   static void equal(String left, String right) {
      main_text += "%"+reg+" = icmp eq i32 "+left+", "+right+"\n";
      reg++;
   }

   static void notequal(String left, String right) {
      main_text += "%"+reg+" = icmp ne i32 "+left+", "+right+"\n";
      reg++;
   }

   static void bigger(String left, String right) {
      main_text += "%"+reg+" = icmp sgt i32 "+left+", "+right+"\n";
      reg++;
   }

   static void smaller(String left, String right) {
      main_text += "%"+reg+" = icmp slt i32 "+left+", "+right+"\n";
      reg++;
   }

   static void repeatstart(String repetitions){
      declare_int(Integer.toString(reg));
      int counter = reg;
      reg++;
      assign_int(Integer.toString(counter), "0");
      br++;
      main_text += "br label %cond"+br+"\n";
      main_text += "cond"+br+":\n";

      load_int(Integer.toString(counter));
      add_int("%"+(reg-1), "1");
      assign_int(Integer.toString(counter), "%"+(reg-1));

      main_text += "%"+reg+" = icmp slt i32 %"+(reg-2)+", "+repetitions+"\n";
      reg++;

      main_text += "br i1 %"+(reg-1)+", label %true"+br+", label %false"+br+"\n";
      main_text += "true"+br+":\n";
      brstack.push(br);
   }

   static void repeatend(){
      int b = brstack.pop();
      main_text += "br label %cond"+b+"\n";
      main_text += "false"+b+":\n";
   }

   static void ifCond(Integer x) {
      main_text += "br i1 %" + (reg-1) + ", label %start_block"+ x +", label %end_block" + x +"\n";
   }

   static void blockStart(Integer x) {
      main_text += "start_block" + x + ":\n";
   }

   static void blockEnd(Integer x) {
      main_text += "br label %end_block" + x + "\n";
      main_text += "end_block" + x + ":\n";
   }

//   static String generate(){
//      String text = "";
//      text += "declare i32 @printf(i8*, ...)\n";
//      text += "declare i32 @sprintf(i8*, i8*, ...)\n";
//      text += "declare i8* @strcpy(i8*, i8*)\n";
//      text += "declare i32 @atoi(i8*)\n";
//      text += "declare i32 @__isoc99_scanf(i8*, ...)\n";
//      text += "declare void @llvm.memcpy.p0i8.p0i8.i64(i8* noalias nocapture writeonly, i8* noalias nocapture readonly, i64, i1 immarg)\n";
//      text += "@strps = constant [4 x i8] c\"%s\\0A\\00\"\n";
//      text += "@strpi = constant [4 x i8] c\"%d\\0A\\00\"\n";
//      text += "@strs = constant [5 x i8] c\"%10s\\00\"\n";
//      text += "@strspi = constant [3 x i8] c\"%d\\00\"\n";
//      text += header_text;
//      text += "define i32 @main() nounwind{\n";
//      text += main_text;
//      text += "ret i32 0 }\n";
//      return text;
//   }
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
