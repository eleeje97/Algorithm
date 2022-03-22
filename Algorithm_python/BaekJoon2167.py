N, M = map(int, input().split())
array = []
for i in range(N):
    array.append(list(map(int, input().split())))

K = int(input())
for a in range(K):
    i, j, x, y = map(int, input().split())
    answer = 0
    current_x = i
    current_y = j
    while i <= x:
        answer += array[current_x-1][current_y-1]
        if current_x == x and current_y == y:
            break
        current_y += 1
        if current_y > y:
            current_y = j
            current_x += 1

    print(answer)
