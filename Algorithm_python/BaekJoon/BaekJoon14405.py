import re
words = input()
words = re.sub("pi|ka|chu", "", words)

if len(words) > 0:
    print('NO')
else:
    print('YES')
