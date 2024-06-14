declare i32 @printf(i8*, ...)
declare i8* @strcat(i8*, i8*)
declare i8* @strcpy(i8*, i8*)
declare i32 @scanf(i8*, ...)
declare void @llvm.memcpy.p0i8.p0i8.i64(i8* noalias nocapture writeonly, i8* noalias nocapture readonly, i64, i1 immarg)
@strps = constant [4 x i8] c"%s\0A\00"
@strpi = constant [4 x i8] c"%d\0A\00"
@strpf = constant [4 x i8] c"%f\0A\00"
@strpd = constant [5 x i8] c"%lf\0A\00"
@strsi = constant [3 x i8] c"%d\00"
@strsf = constant [3 x i8] c"%f\00"
@strsd = constant [4 x i8] c"%lf\00"
@strss = constant [5 x i8] c"%10s\00"
@x = global i32 0
@y = global i32 0
@z = global i32 0
@str1 = constant [19 x i8] c"y is bigger than x\00"
@str2 = constant [19 x i8] c"x is bigger than y\00"
define i32 @f() nounwind {
%l = alloca i32
store i32 8, i32* %l
%1 = load i1, i1* %l
%2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i1 %1)
%3 = load i32, i32* @x
%4 = alloca i32
store i32 0, i32* %4
br label %cond1
cond1:
%5 = load i32, i32* %4
%6 = add i32 %5, 1
store i32 %6, i32* %4
%7 = icmp slt i32 %5, 6
br i1 %7, label %true1, label %false1
true1:
%8 = load i32, i32* @z
%9 = add i32 %8, 1
%z = alloca i32
store i32 %9, i32* %z
%10 = load i1, i1* %z
%11 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i1 %10)
br label %cond1
false1:
%f = alloca i32
store i32 0, i32* %f
%12 = load i32, i32* %f
ret i32 %12
}
define i32 @main() nounwind{
start_block1:
store i32 6, i32* @x
store i32 7, i32* @y
%1 = load i32, i32* @x
%2 = load i32, i32* @y
%3 = add i32 %1, %2
store i32 %3, i32* @z
%4 = load i32, i32* @y
%5 = load i32, i32* @x
%6 = icmp sgt i32 %4, %5
br i1 %6, label %start_block4, label %end_block4
start_block4:
%str1 = alloca [19 x i8]
%7 = bitcast [19 x i8]* %str1 to i8*
call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %7, i8* align 1 getelementptr inbounds ([19 x i8], [19 x i8]* @str1, i32 0, i32 0), i64 19, i1 false)
%ptrstr1 = alloca i8*
%8 = getelementptr inbounds [19 x i8], [19 x i8]* %str1, i64 0, i64 0
store i8* %8, i8** %ptrstr1
%yes = alloca i8*
store i8* %8, i8** %yes
%9 = load i8*, i8** %yes
%10 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %9)
br label %end_block4
end_block4:
%11 = load i32, i32* @y
%12 = load i32, i32* @x
%13 = icmp slt i32 %11, %12
br i1 %13, label %start_block8, label %end_block8
start_block8:
%str2 = alloca [19 x i8]
%14 = bitcast [19 x i8]* %str2 to i8*
call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %14, i8* align 1 getelementptr inbounds ([19 x i8], [19 x i8]* @str2, i32 0, i32 0), i64 19, i1 false)
%ptrstr2 = alloca i8*
%15 = getelementptr inbounds [19 x i8], [19 x i8]* %str2, i64 0, i64 0
store i8* %15, i8** %ptrstr2
%no = alloca i8*
store i8* %15, i8** %no
%16 = load i8*, i8** %no
%17 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %16)
br label %end_block8
end_block8:
%l = alloca i32
store i32 7, i32* %l
%18 = call i32 @f()
%19 = load i1, i1* %l
%20 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i1 %19)
%21 = load i1, i1* @z
%22 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i1 %21)
br label %end_block1
end_block1:
ret i32 0 }