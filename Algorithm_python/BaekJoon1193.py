num = int(input())
i = 1
count = 0
while num > i:
    num -= i
    i += 1

if i%2 == 0:
    print(str(num) + '/' + str(i+1-num))
else:
    print(str(i+1-num) + '/' + str(num))
