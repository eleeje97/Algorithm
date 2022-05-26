command = input()
cmd_list = []
cnt = 0
for i in command[1:]:
    if i.isupper():
        nop = 4 - (cnt+1)%4
        if nop == 4:
            nop = 0
        cmd_list.append(nop)
        cnt = 0
    else:
        cnt += 1

print(sum(cmd_list))
