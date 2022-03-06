import itertools

love = "LOVE"
name = input()
alpha_dict = {}
for k in love:
    alpha_dict.setdefault(k, 0)
for k in name:
    if alpha_dict.keys().__contains__(k):
        alpha_dict[k] += 1

num = int(input())
lst = []
for i in range(num):
    lst.append(input())

lst.sort()


def getScore(teamName):
    temp = alpha_dict.copy()
    for j in teamName:
        if temp.keys().__contains__(j):
            temp[j] += 1

    score = 1
    for j in itertools.combinations(temp.values(), 2):
        score *= sum(list(j))
    return score % 100


max = 0
answer = lst[0]
for i in lst:
    score = getScore(i)
    if score > max:
        max = score
        answer = i


print(answer)
