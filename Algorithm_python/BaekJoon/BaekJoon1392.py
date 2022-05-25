N, Q = map(int, input().split())

scores = []
for i in range(N):
    scores.append(int(input()))

for i in range(Q):
    answer = 0
    time = 0
    q = int(input())
    while time <= q:
        answer += 1
        time += scores[answer-1]

    print(answer)
