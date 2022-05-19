N, L = map(int, input().split())

num = 0
count = 0
while count < N:
    num += 1
    if not str(num).__contains__(str(L)):
        count += 1

print(num)
