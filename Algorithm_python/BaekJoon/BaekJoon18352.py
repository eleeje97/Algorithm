from collections import defaultdict, deque
import sys

input = sys.stdin.readline
N, M, K, X = map(int, input().split())


def bfs():
    global graph, K, answer, X
    queue = deque([(X, 0)])
    visited = [False for _ in range(N+1)]
    visited[X] = True
    while queue:
        node, depth = queue.popleft()
        for child in graph[node]:
            if not visited[child]:
                if depth == K-1:
                    answer.append(child)
                queue.append((child, depth+1))
                visited[child] = True


graph = defaultdict(list)
for i in range(M):
    start, end = map(int, input().split())
    graph[start].append(end)

answer = []
bfs()
if len(answer) == 0:
    print(-1)
else:
    answer.sort()
    for i in answer:
        print(i)
