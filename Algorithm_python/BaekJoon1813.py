N = int(input())
statements = list(map(int, input().split()))
statements.sort(reverse=True)
dic = {}
answer = 0

for i in statements:
    dic[i] = dic.get(i, 0) + 1

for k, v in dic.items():
    if k == v:
        answer = k
        break

if answer == 0 and 0 in dic.keys():
    answer = -1

print(answer)
