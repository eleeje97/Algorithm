import sys
input = sys.stdin.readline

N = int(input())
main = input().rstrip()
main_dic = {}
for i in main:
    main_dic[i] = main_dic.get(i, 0) + 1

answer = 0
for i in range(N-1):
    word = input().rstrip()
    word_dic = {}
    for j in word:
        word_dic[j] = word_dic.get(j, 0) + 1

    a = 0
    b = 0
    for j in main_dic:
        if main_dic[j] > word_dic.get(j, 0):
            a += main_dic[j] - word_dic.get(j, 0)
        else:
            b += word_dic[j] - main_dic[j]

    for j in word_dic:
        if j not in main:
            b += word_dic[j]

    if a <= 1 and b <= 1:
        answer += 1

print(answer)



