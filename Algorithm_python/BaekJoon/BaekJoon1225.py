A, B = input().split()

sumA = 0
for i in A:
    sumA += int(i)

answer = 0
for i in B:
    answer += sumA * int(i)

print(answer)
