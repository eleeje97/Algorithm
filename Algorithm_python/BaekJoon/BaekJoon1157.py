a = input()
a = str.upper(a)

str_dict = {}

for i in a:
    if str_dict.keys().__contains__(i):
        str_dict[i] += 1
    else:
        str_dict[i] = 1


maxNum = 0
for k, v in str_dict.items():
    if maxNum == v:
        answer = "?"
    else:
        if maxNum < v:
            maxNum = v
            answer = k

print(answer)
