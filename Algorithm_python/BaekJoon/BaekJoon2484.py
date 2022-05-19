N = int(input())
prizes = []
for i in range(N):
    dice = list(map(int, input().split()))
    prize = 0

    count = {}
    for j in dice:
        count[j] = count.get(j, 0) + 1

    for k, v in count.items():
        if v == 4:
            prize = 50000 + k * 5000
            break
        elif v == 3:
            prize = 10000 + k * 1000
            break
        elif v == 2:
            if len(count) == 2:
                prize += 1000 + k * 500
            if len(count) == 3:
                prize = 1000 + k * 100
        else:
            if len(count) == 4:
                prize = max(prize, k * 100)

    prizes.append(prize)

print(max(prizes))
