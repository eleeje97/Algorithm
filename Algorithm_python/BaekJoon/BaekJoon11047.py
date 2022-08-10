import sys
input = sys.stdin.readline

n, k = map(int, input().split())
values = []
for i in range(n):
    values.append(int(input()))
values.reverse()
cnt = 0
for i in values:
    cnt += k // i
    k -= (k // i) * i
print(cnt)
