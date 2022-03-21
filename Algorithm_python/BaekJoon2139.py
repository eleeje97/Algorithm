days = {1:31, 2:28, 3:31, 4:30, 5:31, 6:30, 7:31, 8:31, 9:30, 10:31, 11:30, 12:31}

while True:
    d, m, y = map(int, input().split())
    if d == 0:
        break

    if (y%4 == 0 and y%100 != 0) or y%400 == 0:
        days[2] = 29
    else:
        days[2] = 28

    count = 0
    for i in range(1, m):
        count += days[i]
    count += d
    print(count)
