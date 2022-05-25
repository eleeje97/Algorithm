word = input()
num = 0
for i in word:
    if ord(i) >= 97:
        num += ord(i) - 96
    else:
        num += ord(i) - 38

flag = True
for i in range(2, num):
    if num % i == 0:
        flag = False
        break

if flag or num == 1:
    print("It is a prime word.")
else:
    print("It is not a prime word.")
