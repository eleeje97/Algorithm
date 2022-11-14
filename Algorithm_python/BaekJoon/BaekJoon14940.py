from collections import deque
import sys
input = sys.stdin.readline

dr = [-1, 1, 0, 0]
dc = [0, 0, -1, 1]


def bfs(r, c):
    global answer, dr, dc, mapp
    queue = deque([(r, c, 0)])
    answer[r][c] = 0

    while queue:
        rr, cc, depth = queue.popleft()

        for idx in range(4):
            nr = rr + dr[idx]
            nc = cc + dc[idx]

            if 0 <= nr < n and 0 <= nc < m and answer[nr][nc] == -1:
                if mapp[nr][nc] == 1:
                    answer[nr][nc] = depth + 1
                    queue.append((nr, nc, depth+1))
                # else:
                #     answer[nr][nc] = 0


n, m = map(int, input().split())
mapp = []
row = -1
col = -1
answer = [[-1 for _ in range(m)] for _ in range(n)]

for i in range(n):
    line = list(map(int, input().split()))
    for j in range(len(line)):
        if line[j] == 0:
            answer[i][j] = 0
        elif line[j] == 2:
            row = i
            col = j
    mapp.append(line)

bfs(row, col)
for line in answer:
    print(' '.join([str(i) for i in line]))
