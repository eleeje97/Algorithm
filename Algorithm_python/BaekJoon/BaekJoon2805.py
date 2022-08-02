import sys
N, M = map(int, sys.stdin.readline().split())
trees = list(map(int, sys.stdin.readline().split()))

start = 0
end = max(trees)
result = 0

while start <= end:
    mid = (start + end) // 2
    get = 0
    for i in trees:
        if i > mid:
            get += (i - mid)
            if get >= M:
                break
    if get < M:
        end = mid - 1
    elif get >= M:
        start = mid + 1
        result = mid

print(result)
