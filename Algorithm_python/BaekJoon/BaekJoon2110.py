import sys
input = sys.stdin.readline

N, C = map(int, input().split())
house = []
for i in range(N):
    house.append(int(input()))
house.sort()

left = 1
right = house[-1] - house[0]
mid = (left + right) // 2
answer = 0
while left <= right:
    cnt = 1
    current = house[0]
    for i in range(1, len(house)):
        if house[i] - current >= mid:
            cnt += 1
            current = house[i]
    if cnt >= C:
        left = mid + 1
        answer = mid
    else:
        right = mid - 1

    mid = (left + right) // 2


print(answer)
