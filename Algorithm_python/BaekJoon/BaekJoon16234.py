### pypy로 통과 ###

import sys

input = sys.stdin.readline
sys.setrecursionlimit(10 ** 5)
dr = [-1, 1, 0, 0]
dc = [0, 0, -1, 1]


def dfs(row, col):
    global pop, visited, dr, dc, N, L, R, country, total
    visited[row][col] = True
    country.append((row, col))
    total += pop[row][col]

    for idx in range(4):
        nr = row + dr[idx]
        nc = col + dc[idx]

        if 0 <= nr < N and 0 <= nc < N and not visited[nr][nc]:
            diff = abs(pop[nr][nc] - pop[row][col])
            if L <= diff <= R:
                dfs(nr, nc)


N, L, R = map(int, input().split())
pop = []
visited = [[False for _ in range(N)] for _ in range(N)]
for i in range(N):
    pop.append(list(map(int, input().split())))

answer = 0
while True:
    cnt = 0
    visited = [[False for _ in range(N)] for _ in range(N)]

    for i in range(N):
        for j in range(N):
            if not visited[i][j]:
                country = []
                total = 0
                dfs(i, j)
                new_pop = total // len(country)
                for r, c in country:
                    pop[r][c] = new_pop
                cnt += 1
    if cnt == N * N:
        break
    answer += 1

print(answer)
