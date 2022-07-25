count = 0


def solution(numbers, target):
    dfs(0, 0, numbers, target)
    return count


def dfs(idx, current, numbers, target):
    global count
    if idx == len(numbers):
        if current == target:
            count += 1
        return

    dfs(idx+1, current+numbers[idx], numbers, target)
    dfs(idx+1, current-numbers[idx], numbers, target)




# n = [1, 1, 1, 1, 1]
# t = 3

n = [4, 1, 2, 1]
t = 4

print(solution(n, t))
