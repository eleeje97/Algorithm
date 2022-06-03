doc = input()
word = input()

cnt = 0
while word in doc:
    cnt += 1
    doc = doc.replace(word, "0", 1)

print(cnt)
