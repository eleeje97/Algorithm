def solution(numbers):
    numbers = list(map(str, numbers))
    numbers.sort(key=lambda x : x*3, reverse=True)
    answer = str(int(''.join(numbers)))
    return answer

numbers = [6, 10, 2]
# numbers = [3, 30, 34, 5, 9]
# numbers = [0, 0, 0]

print(solution(numbers))
