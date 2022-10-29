from sys import stdin

N, K = map(int, stdin.readline().split())
arr = stdin.readline()

answer = 0
idx = 0
for i in range(N):
    if arr[i] == 'P':
        idx = max(idx, i-K)
        for j in range(idx, i+K+1):
            if j < N and arr[j] == 'H':
                answer += 1
                idx = j+1
                break

print(answer)


'''
12 1
HPHPHPHHPPHP
'''