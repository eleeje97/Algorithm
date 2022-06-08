n, m = map(int, input().split())
s = []
for i in range(n):
    s.append(input())

cnt = 0
for i in range(m):
    if input() in s:
        cnt += 1
print(cnt)

# s = []
# for i in range(n+m):
#     print(i)
#     s.append(input())
#     print(s)
# print(len(s) - len(set(s)))
