N = int(input())
mines = ['0'*(N+2)]
for i in range(N):
    mines.append('0' + input().replace('.', '0') + '0')
mines.append('0'*(N+2))

map = []
for i in range(1, N+1):
    tmp = ''
    for j in range(1, N+1):
        if mines[i][j] != '0':
            tmp += '*'
        else:
            count = int(mines[i-1][j-1]) + int(mines[i][j-1]) + int(mines[i+1][j-1]) \
                    + int(mines[i-1][j]) + int(mines[i+1][j]) \
                    + int(mines[i-1][j+1]) + int(mines[i][j+1]) + int(mines[i+1][j+1])
            if count >= 10:
                tmp += 'M'
            else:
                tmp += str(count)
    map.append(tmp)

for i in map:
    print(i)
