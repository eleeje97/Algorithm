from collections import deque
import sys

input = sys.stdin.readline


def isPossible(channel):
    global broken
    for num in str(channel):
        if broken[int(num)]:
            return False
    return True


N = int(input())
M = int(input())


if M == 0:
    answer = min(len(str(N)), abs(100-N))
else:
    queue = deque([N])
    broken = [False for i in range(10)]
    for i in input().split():
        broken[int(i)] = True

    answer = abs(100-N)
    for i in range(0, 1000000):
        if isPossible(i):
            answer = min(answer, len(str(i)) + abs(N-i))

print(answer)
