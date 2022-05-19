import sys
s = sys.stdin.read()
lst = s.split('\n')

for i in lst:
    tmp = i.split()
    tmp = [tmp[0:2], tmp[2:4], tmp[4:6], tmp[6:8]]

    dots = []
    for j in tmp:
        if j in dots:
            mid = j
            dots.remove(j)
        else:
            dots.append(j)

    if len(dots) == 2:
        x = float(dots[0][0]) + float(dots[1][0]) - float(mid[0])
        y = float(dots[1][1]) - float(mid[1]) + float(dots[0][1])
        print(f"{x: .3f}".strip(), f"{y: .3f}".strip())
