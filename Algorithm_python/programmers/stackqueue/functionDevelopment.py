import math


def solution(progresses, speeds):
    answer = []
    days = [math.ceil((100 - progresses[i])/speeds[i]) for i in range(len(progresses))]

    current = days[0]
    cnt = 0
    for i in days:
        if i <= current:
            cnt += 1
        else:
            answer.append(cnt)
            cnt = 1
            current = i
    answer.append(cnt)

    return answer


print(solution([93, 30, 55], [1, 30, 5]))
print(solution([95, 90, 99, 99, 80, 99], [1, 1, 1, 1, 1, 1]))
