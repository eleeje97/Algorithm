import math
import sys
input = sys.stdin.readline


def dfs(number):
    global N
    if len(str(number)) == N:
        print(number)
        return

    for n in range(10):
        next = int(number + str(n))
        if isPrime(next):
            dfs(str(next))


def isPrime(number):
    if number == 1:
        return False
    for n in range(2, int(math.sqrt(number))+1):
        if number % n == 0:
            return False
    return True


N = int(input())
for i in range(1, 10):
    if isPrime(i):
        dfs(str(i))
