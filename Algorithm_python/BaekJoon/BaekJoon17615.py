import sys
input = sys.stdin.readline

N = int(input().rstrip())
balls = input().rstrip()


def sol():
    start = 0
    end = 0
    for i in range(len(balls)):
        if balls[i] != balls[0]:
            start = i
            break

    if start == len(balls):
        return 0

    for i in range(len(balls)-1, -1, -1):
        if balls[i] != balls[-1]:
            end = len(balls) - i - 1
            break

    if start + end == len(balls):
        return 0

    red = 0
    blue = 0
    for i in balls:
        if i == 'R':
            red += 1
        else:
            blue += 1

    if balls[0] == balls[-1]:
        if balls[0] == 'R':
            return min(red - max(start, end), blue)
        else:
            return min(blue - max(start, end), red)
    else:
        if balls[0] == 'R':
            return min(red - start, blue - end)
        else:
            return min(blue - start, red - end)


print(sol())
