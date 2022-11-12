import sys
input = sys.stdin.readline

arr = list(input().rstrip())
idx = 0
num = ['1']
cnt = 1
while idx < len(arr):
    if arr[idx] == num.pop(0):
        idx += 1
    if idx == len(arr):
        break
    if len(num) == 0:
        cnt += 1
        num = list(str(cnt))

print(cnt)
