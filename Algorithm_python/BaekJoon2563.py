arr = []
for i in range(100):
    tmp = [0] * 100
    arr.append(tmp)

N = int(input())
for i in range(N):
    x, y = map(int, input().split())
    for j in range(x, x+10):
        for k in range(y, y+10):
            arr[j][k] = 1

answer = 0
for i in range(100):
    answer += sum(arr[i])
print(answer)
