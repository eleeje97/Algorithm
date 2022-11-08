import sys
input = sys.stdin.readline

N, D = map(int, input().split())

shortcut = []
for i in range(N):
    shortcut.append(tuple(map(int, input().split())))
shortcut.sort(key=lambda x: x[0])

dist = [i for i in range(D+1)]  # dp배열
for i in range(0, D+1):
    if i > 0:
        dist[i] = min(dist[i], dist[i-1] + 1)
    while shortcut:
        if shortcut[0][0] == i:
            pop = shortcut.pop(0)
            if pop[1] <= D:
                dist[pop[1]] = min(dist[pop[1]], dist[i] + pop[2])
        else:
            break

print(dist[D])
