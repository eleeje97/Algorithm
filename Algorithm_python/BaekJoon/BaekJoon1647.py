import sys
input = sys.stdin.readline

def find(v):
    global unf
    if v == unf[v]:
        return v
    else:
        unf[v] = find(unf[v])
        return unf[v]

def union(a, b):
    global unf
    fa = find(a)
    fb = find(b)
    if fa > fb:
        unf[fa] = fb
    else:
        unf[fb] = fa

N, M = map(int, input().split())
tree = []
for i in range(M):
    tree.append(list(map(int, input().split())))
tree.sort(key=lambda x: x[2])

unf = [i for i in range(N+1)]
visited = [False for _ in range(N+1)]
cost = 0
max_cost = 0
cnt = 0
for a, b, c in tree:
    v1 = find(a)
    v2 = find(b)

    if v1 != v2:
        cost += c
        union(v1, v2)
        cnt += 1

        if cnt == N-2:
            break

print(cost)
