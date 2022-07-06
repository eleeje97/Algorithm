import sys
input = sys.stdin.readline

T = int(input())
for i in range(T):
    n = int(input())
    stickers = [list(map(int, input().split())), list(map(int, input().split()))]

    dp = [[0]*3 for _ in range(n+1)]

    for j in range(1, n+1):
        dp[j][0] = max(dp[j-1])
        dp[j][1] = max(dp[j-1][0], dp[j-1][2]) + stickers[0][j-1]
        dp[j][2] = max(dp[j-1][0], dp[j-1][1]) + stickers[1][j-1]

    print(max(dp[n]))
