n = int(input())

for i in range(n):
    R, S = input().split()
    ans = ""
    for j in S:
        ans += j * int(R)
    print(ans)
