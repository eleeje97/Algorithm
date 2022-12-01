import sys
input = sys.stdin.readline

n, k = map(int, input().split())
coins = []
for _ in range(n):
    coins.append(int(input()))

dp = [sys.maxsize] * (k+1)
dp[0] = 0
for val in coins:
    for i in range(val, k+1):
        dp[i] = min(dp[i], dp[i-val]+1)

if dp[k] == sys.maxsize:
    print(-1)
else:
    print(dp[k])
