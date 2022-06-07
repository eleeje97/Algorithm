import re

sentences = re.split("[- ]", input())
cnt = len(sentences)

for i in sentences:
    if "'" in i:
        if re.match("^[cjnmtsld]$|^qu$", i.split("'")[0]) and re.match("^[aeiouh]", i.split("'")[1]):
            cnt += 1
print(cnt)
