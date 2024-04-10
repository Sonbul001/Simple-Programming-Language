#include <stdio.h>
#include <string.h>

static int reg = 1;
static String main_text = "";

static void and_func(String val1, String val2) {
      reg++;

      main_text += "%" + reg + " = call i32 @strcmp(i8* "+val2+", i8* \"false\")\n";
      reg++;
      main_text += "%" + reg + " = icmp eq i32 %" + (reg-1) + ", 0\n";
      reg++;
      main_text += "br i1 %" + (reg-1) + ", label %endif, label %then\n";
      then:
         main_text += "%" + reg + " = call i32 @strcmp(i8* "+val1+", i8* \"true\")\n";
         reg++;
         main_text += "%" + reg + " = icmp eq i32 %" + (reg-1) + ", 0\n";
         reg++;
         main_text += "store i32 1, i32* %" + (reg-4) + "\n";

      endif:
         main_text += "%" + reg + " = phi i32 [0, %" + (reg-3) + "], [1, %" + (reg-2) + "]\n";
         reg++;
         main_text += "%" + (reg+2) + " = select i8* i8* \"true\", i8* \"false\", i32 %" + (reg-1) + "\n";
         reg++;
   }

int main() {
    int result;
    result = and_func("\"true\"", "\"true\"");
    printf("and(\"true\", \"true\") = %d\n", result ? 1 : 0);
    result = and_func("\"true\"", "\"false\"");
    printf("and(\"true\", \"false\") = %d\n", result ? 1 : 0);
    result = and_func("\"false\"", "\"true\"");
    printf("and(\"false\", \"true\") = %d\n", result ? 1 : 0);
    result = and_func("\"false\"", "\"false\"");
    printf("and(\"false\", \"false\") = %d\n", result ? 1 : 0);
    return 0;
}
