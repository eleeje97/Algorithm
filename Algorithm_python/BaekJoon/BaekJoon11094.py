n = int(input())
for i in range(n):
    sentence = input()
    if sentence.startswith('Simon says '):
        print(sentence[10:])
