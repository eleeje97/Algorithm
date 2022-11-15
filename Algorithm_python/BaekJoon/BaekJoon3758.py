import sys
input = sys.stdin.readline

T = int(input().rstrip())
for x in range(T):
    n, k, t, m = map(int, input().split())
    score = [[0 for _ in range(k+1)] for _ in range(n+1)]
    cnt = [0 for _ in range(n+1)]
    last_submit = [0 for _ in range(n+1)]
    for y in range(m):
        i, j, s = map(int, input().split())
        score[i][j] = max(score[i][j], s)
        cnt[i] += 1
        last_submit[i] = y

    result = []
    for team in range(1, len(score)):
        result.append((team, sum(score[team]), cnt[team], last_submit[team]))
    result.sort(key=lambda z: (-z[1], z[2], z[3]))

    rank = 0
    for team, _, _, _ in result:
        rank += 1
        if team == t:
            print(rank)
            break

