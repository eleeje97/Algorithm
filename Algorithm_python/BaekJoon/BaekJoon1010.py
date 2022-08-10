import sys
input = sys.stdin.readline

T = int(input())
for i in range(T):
    n, m = map(int, input().split())
    answer = 1
    for j in range(n):
        answer *= m-j
        answer /= j+1
    print(int(answer))
