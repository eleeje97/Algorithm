from collections import deque


def solution(number, k):
    number_lst = list(map(int, list(number)))
    stack = deque()
    cnt = 0
    for i, num in enumerate(number_lst):
        while stack and stack[-1] < num:
            stack.pop()
            cnt += 1
            if cnt == k:
                return ''.join(str(i) for i in stack) + number[i:]
        stack.append(num)

    for i in range(cnt, k):
        stack.pop()
    answer = ''.join(str(i) for i in stack)

    return answer


print(solution("1924", 2))
print(solution("1231234", 3))
print(solution("4177252841", 4))
print(solution("4321", 1))
