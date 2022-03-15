N = int(input())

progression = []
for i in range(N):
    progression.append(int(input()))

if progression[1] - progression[0] == progression[2] - progression[1]:
    q = progression[1] - progression[0]
    answer = progression[-1] + q
if progression[1] / progression[0] == progression[2] / progression[1]:
    q = progression[1] // progression[0]
    answer = progression[-1] * q

print(answer)
