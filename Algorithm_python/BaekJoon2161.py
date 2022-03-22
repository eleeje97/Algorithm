N = int(input())

cards = []
for i in range(N):
    cards.append(i+1)

answer = ''
while len(cards) > 1:
    answer += str(cards[0]) + ' '
    cards.remove(cards[0])
    cards.append(cards[0])
    cards.remove(cards[0])

answer += str(cards[0])
print(answer)
