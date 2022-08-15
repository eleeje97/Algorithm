import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**5)


def dfs(v, tree, cnt=-1):
    global answer, visited
    visited[v] = True
    cnt += 1

    if v != 1 and len(tree[v]) == 1:
        answer += cnt
        cnt -= 1

    for w in tree[v]:
        if not visited[w]:
            dfs(w, tree, cnt)


n = int(input())
tree = [[] for _ in range(n+1)]
visited = [False for _ in range(n+1)]

for i in range(n-1):
    a, b = map(int, input().split())
    tree[a].append(b)
    tree[b].append(a)

answer = 0
dfs(1, tree)
if answer % 2 == 0:
    print("No")
else:
    print("Yes")

'''
1) visited에 노드 값 자체를 넣지 말고 boolean 배열(모두 False)로 초기화하고 방문했을 때 True로 바꿔주는 방식
2) 자식노드가 없다는 판단 -> root 노드가 아님 (여기서는 1이 아님), 연결된 노드 개수가 1임 (부모 노드밖에 없으므로)
3) depth를 구해야할 때는 depth배열을 처음부터 0으로 초기화하고 depth[w] = depth[v] + 1 과 같이 구할 수 있다.
4) 재귀호출의 제한을 임의로 조절할 수 있음 -> sys.setrecursionlimit(10**5)
'''