str1 = sorted(list(input()))
str2 = sorted(list(input()))

answer = 0
index1 = 0
index2 = 0

while 0 < len(str1) and 0 < len(str2):
    if str1[0] < str2[0]:
        answer += 1
        str1.remove(str1[0])
    elif str1[index1] > str2[index2]:
        answer += 1
        str2.remove(str2[0])
    else:
        str1.remove(str1[0])
        str2.remove(str2[0])

answer += len(str1) - index1
answer += len(str2) - index2
print(answer)
