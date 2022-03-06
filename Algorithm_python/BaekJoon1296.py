import itertools

name = input()
alpha_dict = {}
for i in name:
    alpha_dict[i] = alpha_dict.get(i, 0) + 1


def getScore(teamName):
    for j in teamName:
        if alpha_dict.keys().__contains__(j):
            alpha_dict[j] += 1

    score = 1
    for j in itertools.combinations(alpha_dict.values(), 2):
        score *= sum(list(j))
    return score % 100


num = int(input())
lst = []
for i in range(num):
    lst.append(input())

lst.sort()

max = 0
for i in lst:
    score = getScore(i)
    print(score)
    if score > max:
        max = score
        answer = i

print(answer)
