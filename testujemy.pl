global x = 6
global y = 7
global z = x + y
if y > x
    yes = "y is bigger than x"
    out yes
endif
if y < x
    no = "x is bigger than y"
    out no
endif
function f
    l = 8
    out l
    repeat x
        global z = z + 1
        out z
    endrepeat
endfunction
l = 7
f
out l
