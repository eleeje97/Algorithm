import itertools

A, B, C = map(int, input().split())

lst = []
for i in itertools.product(range(1, A+1), range(1, B+1), range(1, C+1)):
    lst.append(list(i))

numbers = {}
for j in lst:
    s = sum(j)
    if numbers.keys().__contains__(s):
        numbers[s] += 1
    else:
        numbers[s] = 1

current = 0
for k, v in numbers.items():
    if current < v:
        current = v
        answer = k

print(answer)
