import sys

input = sys.stdin.readline

T = int(input())

for i in range(T):
    N = int(input())

    scores = {}
    for j in range(N):
        paper, interview = map(int, input().split())
        scores[paper] = interview

    answer = 1
    cur = 1
    for j in range(2, N+1):
        if scores[j] < scores[cur]:
            cur = j
            answer += 1

    print(answer)
