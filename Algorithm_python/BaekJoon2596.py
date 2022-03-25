N = int(input())
letter = input()
letters = []
code = {'000000':'A', '001111':'B', '010011':'C', '011100':'D', '100110':'E', '101001':'F', '110101':'G', '111010':'H'}

for i in range(0,N*6,6):
    letters.append(letter[i:i+6])

answer = ''
for i, l in enumerate(letters):
    if l in code.keys():
        answer += code[l]
    else:
        flag = True
        for k, v in code.items():
            count = 0
            for j in range(6):
                if l[j] != k[j]:
                    count += 1
            if count == 1:
                answer += v
                flag = False
                break
        if flag:
            answer = i+1
            break

print(answer)