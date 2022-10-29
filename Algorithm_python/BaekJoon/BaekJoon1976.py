from sys import stdin


def dfs(city):
    visited[city-1] = 1
    for w in range(N):
        if visited[w] == 0 and arr[city-1][w] == 1:
            dfs(w+1)


N = int(stdin.readline())
M = int(stdin.readline())

arr = []
for i in range(N):
    arr.append(list(map(int, stdin.readline().split())))

trip = list(map(int, stdin.readline().split()))

visited = [0 for _ in range(N)]
dfs(trip[0])

answer = True
for i in trip:
    if visited[i-1] == 0:
        answer = False

if answer:
    print("YES")
else:
    print("NO")
