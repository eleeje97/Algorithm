def getNum(s, e):
    
    return 0


for i in range(3):
    start, end = input().split()
    start = start.replace(':', '')
    end = end.replace(':', '')

    if start > end:
        answer = getNum(start, 235959) + getNum(0, end)
    else:
        answer = getNum(start, end)

    print(answer)

