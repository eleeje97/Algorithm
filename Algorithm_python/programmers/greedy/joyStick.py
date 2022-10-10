def solution(name):
    answer = 0
    move = len(name) - 1

    for i, c in enumerate(name):
        alpha = ord(c) - 65
        answer += min(alpha, 26 - alpha)

        idx = i + 1
        while idx < len(name) and name[idx] == 'A':
            idx += 1

        move = min(move, i*2 + len(name) - idx, (len(name) - idx)*2 + i)

    answer += move

    return answer


print(solution("BBABBBB")) # 12
print(solution("BBBABBB")) # 12
print(solution("BBAABBBB")) # 12
print(solution("BABBBBB")) # 11
print(solution("BBABBBA")) # 10
print(solution("BBAAABB")) # 8
print(solution("BBAABAAABB")) # 13
print(solution("BBBAAAB")) # 8
print(solution("ZARRAAAAAAHAA")) # 35

