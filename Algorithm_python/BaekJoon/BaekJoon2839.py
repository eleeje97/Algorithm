n = int(input())

answer = -1
for i in range(n//5, -1, -1):
    if (n - i*5) % 3 == 0:
        answer = i + (n - i*5) // 3
        break

print(answer)
