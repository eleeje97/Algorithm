import sys
input = sys.stdin.readline

T = int(input())
for i in range(T):
    profit = 0
    N = int(input())
    prices = list(map(int, input().split()))
    max_price = prices[-1]
    for j in range(len(prices)-1, -1, -1):
        if max_price >= prices[j]:
            profit += max_price - prices[j]
        else:
            max_price = prices[j]

    print(profit)
