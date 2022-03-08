N, Q = map(int, input().split())

score = []
for i in range(N):
    score.append(int(input()))

for i in range(Q):
    answer = 0
    time = 0
    q = int(input())
    while time <= q:
        answer += 1
        time += score[answer-1]

    print(answer)
