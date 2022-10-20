from collections import deque


def solution(priorities, location):
    answer = 0
    temp = priorities.copy()
    ready = deque(i for i in range(len(priorities)))
    while True:
        idx = ready.popleft()
        if priorities[idx] >= max(temp):
            answer += 1
            temp.remove(priorities[idx])
            if idx == location:
                break
        else:
            ready.append(idx)

    return answer


print(solution([2, 1, 3, 2], 2))
print(solution([1, 1, 9, 1, 1, 1], 0))
