N = int(input())

space = []
for i in range(N):
    space.append(input())

horizontal = 0
vertical = 0
count_h = 0
count_v = 0
for i in range(N):
    for j in range(N):
        if j == 0:
            count_h = 0
            count_v = 0
        if space[i][j] == 'X':
            count_h = 0
        else:
            count_h += 1
            if count_h == 2:
                horizontal += 1

        if space[j][i] == 'X':
            count_v = 0
        else:
            count_v += 1
            if count_v == 2:
                vertical += 1


print(horizontal, vertical)
