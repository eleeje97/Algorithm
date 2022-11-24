from collections import defaultdict
import sys
input = sys.stdin.readline

T = int(input())
for _ in range(T):
    N = int(input())
    order = list(map(int, input().split()))
    cnt = defaultdict(int)
    teams = []
    for team in order:
        cnt[team] += 1
        if cnt[team] == 6:
            teams.append(team)

    scores = defaultdict(list)
    score = 1
    for team in order:
        if team in teams:
            scores[team].append(score)
            score += 1

    total = defaultdict()
    for team in teams:
        total[team] = (sum(scores[team][:4]), scores[team][4])

    print(sorted(total.items(), key=lambda x: x[1])[0][0])
