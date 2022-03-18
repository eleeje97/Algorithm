o = 0
w = 0

scenario = []
temp = []

while True:
    mode, num = input().split()
    if mode == "#":
        scenario.append(temp.copy())
        temp = []
    elif mode == "0":
        break
    else:
        temp.append([mode, num])

n = 0
for i in scenario:
    o = int(i[0][0])
    w = int(i[0][1])
    n += 1
    for mode, num in i[1:]:
        if mode == "F":
            w += int(num)
        else:
            w -= int(num)
            if w <= 0:
                break
    if o * 0.5 < w < o * 2:
        print(n, ":-)")
    elif w <= 0:
        print(n, "RIP")
    else:
        print(n, ":-(")
