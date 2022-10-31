import heapq
import sys
input = sys.stdin.readline

N, M = map(int, input().split())
farm = [[] for _ in range(N+1)]
for i in range(M):
    A, B, C = map(int, input().split())
    farm[A].append((B, C))
    farm[B].append((A, C))


def dijkstra():
    heap = []
    heapq.heappush(heap, (1, 0))
    total = [sys.maxsize] * (N+1)
    total[1] = 0
    while heap:
        node, cost = heapq.heappop(heap)
        if node == N:
            return total[node]

        if total[node] >= cost:
            for nNode, nCost in farm[node]:
                if cost + nCost < total[nNode]:
                    total[nNode] = cost + nCost
                    heapq.heappush(heap, (nNode, cost + nCost))


print(dijkstra())
