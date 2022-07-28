def solution(n, lost, reserve):
    lost.sort()
    reserve.sort()

    for i in lost.copy():
        if i in reserve:
            reserve.remove(i)
            lost.remove(i)

    answer = n - len(lost)

    for i in lost:
        if i-1 in reserve:
            answer += 1
            reserve.remove(i-1)
        elif i+1 in reserve:
            answer += 1
            reserve.remove(i+1)
    return answer


# n = 5
# lost = [2, 4]
# reserve = [1, 3, 5]

# n = 5
# lost = [2, 4]
# reserve = [3]

n = 3
lost = [3]
reserve = [1]


print(solution(n, lost, reserve))
# print(solution(5, [3, 4], [2, 3, 5]))
# print(solution(5, [3, 4], [4]))
# print(solution(5, [1,2,3,4,5], [1]))
# print(solution(6, [2,4,6], [1,2,3]))
# print(solution(10, [2,4,5,6,9],[1,4,7,10]))
# print(solution(3, [1,2], [2,3]))
# print(solution(5, [1,2],[2,3]))
# print(solution(5, [4,2], [1,3]))
# print(solution(5, [4,2], [3]))
