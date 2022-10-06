def solution(s):
    current = 0

    for i in s:
        if i == '(':
            current += 1
        else:
            current -= 1

        if current < 0:
            return False

    if current != 0:
        return False

    return True


print(solution("()()"))
print(solution("(())()"))
print(solution(")()("))
print(solution("(()("))
