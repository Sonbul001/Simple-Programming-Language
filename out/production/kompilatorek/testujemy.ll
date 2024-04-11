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
%str_buffer = alloca [50 x i8]
%format_str = alloca [5 x i8]
store [3 x i8] c"%s\00", [3 x i8]* %format_str
%ptr = getelementptr inbounds [50 x i8], [50 x i8]* %str_buffer, i32 0, i32 0
%1 = call i32 (i8*, ...) @scanf(i8* %format_str, i8* %str_buffer)
%src = bitcast [50 x i8]* %str_buffer to i8*
%2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %src)
ret i32 0 }
