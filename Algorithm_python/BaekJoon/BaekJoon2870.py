import re
n = int(input())
lst = []
for i in range(n):
    line = input()
    lst.extend(re.split("[a-z]+", line))
ans = []
for i in lst:
    if len(i) > 0:
        ans.append(int(i))
ans.sort()
for i in ans:
    print(i)
