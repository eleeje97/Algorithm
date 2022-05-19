for i in range(3):
    a = input()
    prev = ' '
    count = 1
    max_count = 1
    for j in a:
        if prev == j:
            count += 1
            max_count = max(max_count, count)
        else:
            count = 1
        prev = j
    print(max_count)
