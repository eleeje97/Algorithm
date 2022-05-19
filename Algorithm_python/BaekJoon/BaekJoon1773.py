N, C = map(int, input().split())
firework_times = [0] * (C+1)
cycles = []
for i in range(N):
    cycles.append(int(input()))

for i in cycles:
    if i == 1:
        firework_times = [1] * C
        break
    else:
        for j in range(i, C + 1, i):
            firework_times[j] = 1

answer = sum(firework_times)
print(answer)
