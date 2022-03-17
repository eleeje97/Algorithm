N = int(input())
for i in range(N):
    letter, number = input().split('-')
    letter_v = 0
    for j in range(3):
        letter_v += (26 ** (2-j)) * (ord(letter[j])-65)
    if abs(letter_v - int(number)) <= 100:
        print("nice")
    else:
        print("not nice")
