import sys
input = sys.stdin.readline

N, M = map(int, input().split())
words = {}
for i in range(N):
    word = input().rstrip()
    if len(word) >= M:
        words[word] = words.get(word, 0) + 1

for i in sorted(words.items(), key=lambda x: (-x[1], -len(x[0]), x[0])):
    print(i[0])
