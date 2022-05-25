N, M, L = map(int, input().split())

counts = []
for i in range(N):
    counts.append(0)

counts[0] = 1
count = 1
current = 0
answer = 0
while count < M:
    if counts[current]%2 == 0:
        current -= L
    else:
        current += L

    current = current%N
    counts[current] += 1
    count = counts[current]
    answer += 1

print(answer)
