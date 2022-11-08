import sys
input = sys.stdin.readline

dr = [-1, 1, 0, 0]
dc = [0, 0, -1, 1]


def dfs(r, c, depth):
    global answer, R, C, board, visited
    visited.add(board[r][c])
    answer = max(answer, depth)

    for idx in range(4):
        nr = r + dr[idx]
        nc = c + dc[idx]
        if 0 <= nr < R and 0 <= nc < C and board[nr][nc] not in visited:
            dfs(nr, nc, depth + 1)
            visited.remove(board[nr][nc])


R, C = map(int, input().split())
board = []
for i in range(R):
    board.append(list(input().rstrip()))
answer = 0
visited = set()
dfs(0, 0, 1)
print(answer)
