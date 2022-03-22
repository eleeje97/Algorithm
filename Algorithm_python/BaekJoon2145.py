while True:
    num = input()
    if num == '0':
        break

    tmp = num
    while len(tmp) > 1:
        num = tmp
        tmp = 0
        for i in num:
            tmp += int(i)
        tmp = str(tmp)

    print(tmp)
