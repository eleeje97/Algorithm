from collections import defaultdict
import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**5)

def dfs(node):
    global graph
    visited[node] = True

    for c in graph[node]:
        if not visited[c]:
            dfs(c)

N, M = map(int, input().split())
graph = defaultdict(list)
for i in range(M):
    u, v = map(int, input().split())
    graph[u].append(v)
    graph[v].append(u)

visited = [False for _ in range(N+1)]
answer = 0
for i in range(1, N+1):
    if not visited[i]:
        dfs(i)
        answer += 1

print(answer)
