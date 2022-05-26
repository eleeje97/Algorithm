N, S = input().split()
N = int(N)
print(len(S))
set_score = {}
game_score = {}

for i in S:
    game_score[i] = game_score.get(i, 0) + 1

    if game_score[i] >= 4:
        flag = 0
        for j in game_score.values():
            if j > 2:
                flag += 1
        if flag > 1:
            print()
    else:
        print()
