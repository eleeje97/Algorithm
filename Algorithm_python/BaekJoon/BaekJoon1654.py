import sys
input = sys.stdin.readline

K, N = map(int, input().split())
lines = []
for i in range(K):
    lines.append(int(input().rstrip()))

left = 1
right = max(lines) + 1
mid = (left+right)//2
answer = right
while left <= right:
    cnt = 0
    for i in lines:
        cnt += i//mid

    if cnt < N:
        right = mid - 1
    else:
        answer = mid
        left = mid + 1

    mid = (left+right)//2

print(answer)

'''
4 4
200
200
200
200
-> 200

2 4
100
1
-> 25

2 2
1
2147483647
-> 1073741823
'''