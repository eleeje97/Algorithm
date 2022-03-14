N = int(input())

num = 1
count = 0
while True:
    if N == 0:
        break
    elif N >= num:
        N -= num
        num += 1
        count += 1
    else:
        num = 1

print(count)
