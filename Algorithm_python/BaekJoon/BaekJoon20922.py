from collections import defaultdict
import sys
input = sys.stdin.readline

N, K = map(int, input().split())
arr = list(map(int, input().split()))
answer = 0
current = 0
dic = defaultdict(list)
for i in range(N):
    if len(dic[arr[i]]) == K:
        idx = dic[arr[i]].pop(0)
        current -= 1

        for j in range(i-current-1, idx):
            dic[arr[j]].pop(0)
            current -= 1

    dic[arr[i]].append(i)
    current += 1
    answer = max(answer, current)

print(answer)
