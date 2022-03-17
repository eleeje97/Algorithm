dic = {'-': 0, '\\': 1, '(': 2, '@': 3, '?': 4, '>': 5, '&': 6, '%': 7, '/': -1}

while True:
    code = input()
    answer = 0
    if code == '#':
        break
    for i in range(len(code)):
        answer += (8**i) * dic[code[len(code)-i-1]]
    print(answer)
