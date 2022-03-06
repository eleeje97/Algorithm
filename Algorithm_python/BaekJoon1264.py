lst = []
while True:
    a = input()
    if a == "#":
        break
    else:
        lst.append(a)

vowel = "AEIOUaeiou"
for i in lst:
    cnt = 0
    for j in i:
        if vowel.__contains__(j):
            cnt += 1
    print(cnt)
