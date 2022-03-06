lst = []
num = int(input())

for i in range(num):
    lst.append(input())

lst.sort()
dic = {}
answer = ""

for i in lst:
    if dic.keys().__contains__(i[0]):
        dic[i[0]] += 1
    else:
        dic[i[0]] = 1


for k, v in dic.items():
    if v >= 5:
        answer += k

if len(answer) <= 0:
    answer = "PREDAJA"

print(answer)
