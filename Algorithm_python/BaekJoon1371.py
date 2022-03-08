import sys
s = sys.stdin.read()

alphabet = {}
for i in s:
    if i.isalpha():
        alphabet[i] = alphabet.get(i, 0) + 1

max_cnt = max(alphabet.values())
answer_list = []
for k, v in alphabet.items():
    if v == max_cnt:
        answer_list.append(k)

answer_list.sort()
answer = ""
for i in answer_list:
    answer += i
print(answer)
