N = input()

answer = ''
flag = False
for i in range(len(N)):
    if int(N[i]) > 7:
        answer += (len(N) - i) * '7'
        break
    elif 4 < int(N[i]) < 7:
        answer += '4'
        answer += (len(N) - i - 1) * '7'
        break
    elif int(N[i]) == 7:
        answer += '7'
    elif int(N[i]) == 4:
        answer += '4'
    else:
        for j in range(len(answer)):
            if int(answer[-j-1]) == 7:
                answer = answer[:i-1] + '4' + (len(N) - j - 1) * '7'
                print(answer)
                flag = True
                break
            answer += (len(N) - i - 1) * '7'
            flag = True
            break
    if flag:
        break

print(answer)
