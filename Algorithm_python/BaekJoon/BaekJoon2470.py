import sys
input = sys.stdin.readline

N = int(input())
solution = list(map(int, input().split()))
solution.sort()
i = 0
j = N-1
mix = 2000000000
a = 0
b = 0
while i < j:
    sum = solution[i] + solution[j]
    if abs(sum) < mix:
        a = solution[i]
        b = solution[j]
        mix = abs(sum)

    if sum < 0:
        i += 1
    else:
        j -= 1

print(a, b)

