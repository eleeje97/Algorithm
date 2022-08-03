def solution(citations):
    answer = 0
    citations.sort(reverse=True)
    for i in range(len(citations), 0, -1):
        if citations[i-1] >= i:
            return i
    return answer


citations = [3, 0, 6, 1, 5]
# citations = [10, 8, 5, 4, 3] ## 4
# citations = [25, 8, 5, 3, 3] ## 3
# citations = [5, 5, 5] ## 3
print(solution(citations))
