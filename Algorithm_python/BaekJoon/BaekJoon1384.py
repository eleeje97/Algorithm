groups = []
while True:
    num = int(input())
    names = []
    messages = []
    if num == 0:
        break
    else:
        for i in range(num):
            temp = input().split()
            names.append(temp[0])
            messages.append(temp[1:])

    groups.append([names.copy(), messages.copy()])


answer = []
for i in groups:
    temp = ["Group " + str(groups.index(i) + 1)]
    for j in range(len(i[0])):
        name = i[0][j]
        messages = i[1][j]
        for index, k in enumerate(messages):
            if k == "N":
                temp.append(i[0][j - index - 1] + " was nasty about " + name)
    if len(temp) == 1:
        temp.append("Nobody was nasty")
    answer.append(temp)


for i in answer:
    for j in i:
        print(j)
    print("")
