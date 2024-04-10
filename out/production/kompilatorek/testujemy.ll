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
define i32 @main() nounwind{
%x = alloca i1
store i1 1, i1* %x
%y = alloca i1
store i1 0, i1* %y
%1 = load i1, i1* %x
%2 = load i1, i1* %y
%entry:
br i1 %2, label %then, label %endif
%then:
%3 = icmp eq i1 %1, 1
%endif:
%4 = icmp eq i1 0, 0
%z = alloca i1
store i1 0, i1* %z
%5 = load i32, i32* %z
%6 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %5)
ret i32 0 }