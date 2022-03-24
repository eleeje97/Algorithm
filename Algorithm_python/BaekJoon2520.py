N = int(input())

for i in range(N):
    input()
    milk, egg, sugar, salt, flour = map(int, input().split())
    banana, straw, choco, walnut = map(int, input().split())

    cake_num = min(milk*2, egg*2, sugar*4, salt*16, flour*(16/9))
    topping = banana + straw//30 + choco//25 + walnut//10

    print(min(int(cake_num), topping))
