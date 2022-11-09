import sys
input = sys.stdin.readline


def dfs(r, c, dx, dist):
    global space, N, M, answer

    for idx in range(-1, 2):
        nr = r + 1
        nc = c + idx
        if idx != dx and 0 < nr <= N and 0 <= nc < M:
            if nr == N:
                answer = min(answer, dist + space[nr][nc])
            dfs(nr, nc, idx, dist + space[nr][nc])


N, M = map(int, input().split())
space = [[0]*M]
for i in range(N):
    space.append(list(map(int, input().split())))

answer = 600
for i in range(M):
    dfs(0, i, 2, 0)
print(answer)
