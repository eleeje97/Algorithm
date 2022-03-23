import itertools

n = int(input())
dots = list(map(int, input().split()))
dots.sort()

answer = 0
for i in itertools.combinations(dots, 2):
    answer += i[1] - i[0]

print(answer * 2)
