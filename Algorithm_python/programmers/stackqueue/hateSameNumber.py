def solution(arr):
    answer = [arr[0]]
    for i in arr[1:]:
        if answer[-1] != i:
            answer.append(i)
    return answer


arr = [1,1,3,3,0,1,1]
# arr = [4,4,4,3,3]
print(solution(arr))
