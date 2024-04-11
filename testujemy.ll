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
define i32 @main() nounwind{
start_block1:
%x = alloca i32
store i32 6, i32* %x
%1 = load i32, i32* %x
%2 = alloca i32
store i32 0, i32* %2
br label %cond1
cond1:
%3 = load i32, i32* %2
%4 = add i32 %3, 1
store i32 %4, i32* %2
%5 = icmp slt i32 %3, 6
br i1 %5, label %true1, label %false1
true1:
%6 = load i32, i32* %x
%7 = add i32 %6, 1
store i32 %7, i32* %x
%8 = load i1, i1* %x
%9 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i1 %8)
br label %cond1
false1:
br label %end_block1
end_block1:
ret i32 0 }