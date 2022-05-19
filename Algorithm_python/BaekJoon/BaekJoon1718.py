text = input()
key = input()
answer = ''
for i, c in enumerate(text):
    if c == ' ':
        answer += ' '
    else:
        sub = 96 + (ord(c) - ord(key[i % len(key)]) + 26) % 26
        if sub == 96:
            sub = 122
        answer += chr(sub)

print(answer)
