def solution(nums):
    n = len(nums)
    type_n = len(set(nums))

    if type_n < n//2:
        answer = type_n
    else:
        answer = n//2

    return answer


# nums = [3,1,2,3]
# nums = [3,3,3,2,2,4]
nums = [3,3,3,2,2,2]

print(solution(nums))
