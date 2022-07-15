import sys
input = sys.stdin.readline

n = int(input())
prices = list(map(int, input().split()))

dp = [[0] * (n+1)] * (n+1)
dp[1] = [i*prices[0] for i in range(n+1)]


for i in range(2, n+1):
    dp[i] = dp[i-1]

    # 1. n보다 작은 i의 배수 살펴보기
    for j in range(n//i):
        card_num = i * (j+1)
        dp[i][card_num] = max(dp[i][card_num], prices[i-1]*(j+1))

    # 2. 1~(n-i) 을 돌면서 i를 더해가며 살펴보기
    for j in range(1, n-i+1):
        card_num = i + j
        dp[i][card_num] = max(dp[i][card_num], dp[i-1][j] + prices[i-1])

print(dp[n][n])

'''
백준에서는 성공 떴지만, 이 로직에는 오류가 있음
n=5 이고, i=2 인 경우,
2짜리 1팩 / 2짜리 2팩 / (1) + 2 / (1+1) + 2 / (1+1+1) + 2 인 경우만 확인한다.
근데, 1 + 2 + 2 인 경우도 확인해봐야 하는게 아닐까
'''