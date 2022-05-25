N, K = map(int, input().split())
progression = list(map(int, input().split(',')))

for i in range(K):
    temp = []
    for j in range(len(progression)-1):
        temp.append(progression[j+1] - progression[j])
    progression = temp.copy()

for i in range(0, len(progression)-1):
    print(progression[i], end=',')
print(progression[-1])
