N = int(input())
cmd = list(input())

for i in range(N-1):
    file = input()
    for j in range(len(cmd)):
        if file[j] != cmd[j]:
            cmd[j] = "?"

print(''.join(map(str, cmd)))
