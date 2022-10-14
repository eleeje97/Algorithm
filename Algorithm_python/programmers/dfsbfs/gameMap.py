from collections import deque
global dx, dy, visited


# 상하좌우 방향 배열
dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]


def solution(maps):
    global visited
    visited = [[0 for _ in range(len(maps[0]))] for _ in range(len(maps))]
    return bfs(maps)


''' 시간초과
def bfs(maps):
    global dx, dy, visited
    queue = deque()
    queue.append([0, 0, 1])

    while queue:
        p = queue.popleft()
        row = p[0]
        col = p[1]
        depth = p[2]

        if row == len(maps) - 1 and col == len(maps[0]) - 1:
            return depth

        visited[row][col] = 1
        for i in range(4):
            nr = row + dy[i]
            nc = col + dx[i]

            if 0 <= nr < len(maps) and 0 <= nc < len(maps[0]) and visited[nr][nc] == 0 and maps[nr][nc] == 1:
                queue.append([nr, nc, depth+1])

    return -1

'''


''' 시간초과 해결
def bfs(maps):
    global dx, dy, visited
    queue = deque()
    queue.append([0, 0, 1])
    visited[0][0] = 1

    while queue:
        p = queue.popleft()
        row = p[0]
        col = p[1]
        depth = p[2]

        if row == len(maps) - 1 and col == len(maps[0]) - 1:
            return depth

        for i in range(4):
            nr = row + dy[i]
            nc = col + dx[i]

            if 0 <= nr < len(maps) and 0 <= nc < len(maps[0]) and visited[nr][nc] == 0 and maps[nr][nc] == 1:
                queue.append([nr, nc, depth+1])
                visited[nr][nc] = 1

    return -1
'''


def bfs(maps):
    global dx, dy
    queue = deque()
    queue.append([0, 0])

    while queue:
        p = queue.popleft()
        row = p[0]
        col = p[1]

        if row == len(maps) - 1 and col == len(maps[0]) - 1:
            return maps[row][col]

        for i in range(4):
            nr = row + dy[i]
            nc = col + dx[i]

            if 0 <= nr < len(maps) and 0 <= nc < len(maps[0]) and maps[nr][nc] == 1:
                queue.append([nr, nc])
                maps[nr][nc] = maps[row][col] + 1

    return -1


print(solution([[1, 0, 1, 1, 1], [1, 0, 1, 0, 1], [1, 0, 1, 1, 1], [1, 1, 1, 0, 1], [0, 0, 0, 0, 1]]))
print(solution([[1, 0, 1, 1, 1], [1, 0, 1, 0, 1], [1, 0, 1, 1, 1], [1, 1, 1, 0, 0], [0, 0, 0, 0, 1]]))
print(solution([[1,1,1,1,1],[1,1,1,1,1],[1,1,1,1,1],[1,1,1,1,1],[1,1,1,1,1]]))
