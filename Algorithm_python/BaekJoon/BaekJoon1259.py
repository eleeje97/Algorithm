while True:
    a = input()
    if a == '0':
        break
    else:
        flag = False
        for i in range(len(a)//2):
            if a[i] != a[len(a)-i-1]:
                flag = True
                break
        if flag:
            print('no')
        else:
            print('yes')
