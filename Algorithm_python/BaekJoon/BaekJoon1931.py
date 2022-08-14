import sys
input = sys.stdin.readline

n = int(input())
meeting_time = []
for i in range(n):
    meeting_time.append(list(map(int, input().split())))
meeting_time.sort(key=lambda x: x[0])
meeting_time.sort(key=lambda x: x[1])

cnt = 0
current = 0
for i in meeting_time:
    if i[0] >= current:
        cnt += 1
        current = i[1]

print(cnt)
