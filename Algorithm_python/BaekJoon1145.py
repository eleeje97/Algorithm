import math
from itertools import combinations


def twolcm(a, b):
    return a * b // math.gcd(a, b)


def threelcm(a, b, c):
    return twolcm(twolcm(a, b), c)


numList = list(map(int, input().split()))
current = threelcm(numList[0], numList[1], numList[2])


for i in combinations(numList, 3):
    a, b, c = map(int, list(i))
    current = min(current, threelcm(a, b, c))

print(current)
