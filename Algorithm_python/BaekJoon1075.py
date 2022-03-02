N = int(int(input())/100) * 100
F = int(input())

if (N % F) == 0:
    answer = "00"
else:
    answer = F - (N % F)
    if answer < 10:
        answer = "0" + str(answer)
    else:
        answer = str(answer)

print(answer)
