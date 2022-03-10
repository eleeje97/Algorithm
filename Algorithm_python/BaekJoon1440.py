import itertools

numbers = list(map(int, input().split(':')))
count = 0
for i in itertools.permutations(numbers, 3):
    h = list(i)[0]
    m = list(i)[1]
    s = list(i)[2]

    if 1 <= h <= 12 and 0 <= m <= 59 and 0 <= s <= 59:
        count += 1

print(count)
