import itertools

def diff(a, b):
    count = 0
    for x in range(5):
        for y in range(7):
            if a[x][y] != b[x][y]:
                count += 1
    return count

N = int(input())
pictures = []

for i in range(N):
    tmp = []
    for j in range(5):
        tmp.append(input())
    pictures.append(tmp)

current_min = 36
for i in itertools.combinations(range(N), 2):
    current = diff(pictures[i[0]], pictures[i[1]])
    if current < current_min:
        current_min = current
        answer = str(i[0]+1) + ' ' + str(i[1]+1)

print(answer)
