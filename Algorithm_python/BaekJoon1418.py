from itertools import combinations_with_replacement

N = int(input())
K = int(input())

numbers = {}
for i in range(2, K+1):
    numbers[i] = 0

prime_numbers = []
for i in range(2, K+1):
    if numbers[i] == 0:
        prime_numbers.append(i)
        for j in range(i, K+1, i):
            numbers[j] = 1

print(prime_numbers)

count = 1
for i in range(1, N+1):
    flag = True
    for j in combinations_with_replacement(prime_numbers, i):
        product = 1
        for k in list(j):
            product *= k
        print(j, product)
        if product > N:
            break
        else:
            count += 1
            flag = False

    if flag:
        break

print(count)
