import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**5)

dr = [-1, 1, 0, 0, -1, 1, -1, 1]
dc = [0, 0, -1, 1, -1, -1, 1, 1]


def dfs(row, col):
    global graph, visited, w, h

    visited[row][col] = True
    for idx in range(8):
        nr = row + dr[idx]
        nc = col + dc[idx]

        if 0 <= nr < h and 0 <= nc < w and graph[nr][nc] == 1 and not visited[nr][nc]:
            dfs(nr, nc)


while True:
    w, h = map(int, input().split())
    if w == 0 and h == 0:
        break

    graph = []
    for _ in range(h):
        graph.append(list(map(int, input().split())))

    visited = [[0 for _ in range(w)] for _ in range(h)]
    answer = 0
    for i in range(h):
        for j in range(w):
            if graph[i][j] == 1 and not visited[i][j]:
                dfs(i, j)
                answer += 1

    print(answer)
