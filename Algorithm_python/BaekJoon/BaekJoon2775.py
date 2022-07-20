t = int(input())

for i in range(t):
    k = int(input())
    n = int(input())

    num = [list(range(1, n+1))]

    for j in range(1, k+1):
        tmp = []
        for l in range(1, n+1):
            tmp.append(sum(num[j-1][:l]))
        num.append(tmp)

    print(num[k][n-1])
