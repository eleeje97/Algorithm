from heapq import heapify, heappop, heappush


def solution(scoville, K):
    answer = 0
    heapify(scoville)

    while scoville[0] < K:
        if len(scoville) == 1:
            answer = -1
            break
        not_spicy1 = heappop(scoville)
        not_spicy2 = heappop(scoville)
        heappush(scoville, not_spicy1 + not_spicy2*2)
        answer += 1

    return answer


print(solution([10, 12, 1, 2, 3, 9], 7))  # 2
print(solution([1, 1, 1], 8))  # -1
