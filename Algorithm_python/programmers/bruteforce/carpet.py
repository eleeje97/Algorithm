import math


def solution(brown, yellow):
    answer = []

    for i in range(1, int(math.sqrt(yellow))+1):
        if yellow%i == 0:
            w = yellow//i + 2
            h = i + 2

            if w*h - yellow == brown:
                answer = [w, h]
                break

    return answer


print(solution(10, 2))
print(solution(8, 1))
print(solution(24, 24))
