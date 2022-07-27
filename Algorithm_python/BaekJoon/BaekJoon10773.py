n = []
for i in range(int(input())):
    num = int(input())
    if num == 0:
        n.pop()
    else:
        n.append(num)

print(sum(n))
