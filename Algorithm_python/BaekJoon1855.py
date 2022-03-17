K = int(input())
code = input()
code_lst = []

for i in range(K, len(code)+1, K):
    code_lst.append(code[i-K:i])

answer = ''
for i in range(K):
    flag = True
    for j in range(len(code_lst)):
        if flag:
            answer += code_lst[j][i]
        else:
            answer += code_lst[j][K-i-1]
        flag = not flag

print(answer)
