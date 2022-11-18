from collections import deque
import sys

input = sys.stdin.readline


def bfs(root):
    global rel, visited

    queue = deque([(root, 0)])
    visited[root] = True

    bacon = 0
    while queue:
        node, depth = queue.popleft()
        for w in rel[node]:
            if not visited[w]:
                visited[w] = True
                queue.append((w, depth+1))
                bacon += depth+1

    return bacon


N, M = map(int, input().split())
rel = [[] for _ in range(N + 1)]
for i in range(M):
    a, b = map(int, input().split())
    rel[a].append(b)
    rel[b].append(a)

answer = 1
min_bacon = sys.maxsize
for i in range(1, N+1):
    visited = [False for _ in range(N + 1)]
    bacon = bfs(i)
    if min_bacon > bacon:
        answer = i
        min_bacon = bacon

print(answer)
