import itertools

heights = []
for i in range(9):
    heights.append(int(input()))
heights.sort()

sub = sum(heights) - 100
for i in itertools.combinations(heights, 2):
    if sum(i) == sub:
        heights.remove(i[0])
        heights.remove(i[1])
        break

for i in heights:
    print(i)
