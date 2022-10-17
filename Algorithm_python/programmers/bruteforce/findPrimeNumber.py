from itertools import permutations


def solution(numbers):
    answer = 0
    nums = set()
    for i in range(1, len(numbers)+1):
        for num in permutations(list(numbers), i):
            nums.add(int(''.join(num)))

    for i in nums:
        if i > 1:
            answer += 1
        for j in range(2, i):
            if i % j == 0:
                answer -= 1
                break

    return answer


print(solution("17"))
print(solution("011"))
