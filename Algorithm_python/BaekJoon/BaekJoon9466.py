import sys
sys.setrecursionlimit(10**5)
input = sys.stdin.readline


def findTeam(p):
    global visited, like, queue, answer

    visited[p] = True
    queue.append(p)
    if visited[like[p-1]]:
        if like[p-1] in queue:
            answer += len(queue) - queue.index(like[p-1])
            return
    else:
        findTeam(like[p-1])


T = int(input())

for i in range(T):
    n = int(input())
    like = list(map(int, input().split()))
    answer = 0
    visited = [False for _ in range(n+1)]

    for j in range(1, n+1):
        if not visited[j]:
            queue = []
            findTeam(j)

    print(n - answer)
