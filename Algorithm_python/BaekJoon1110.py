num = int(input())
if num < 10:
    sum = num
    b = num
else:
    sum = num//10 + num%10
    b = num%10

count = 1
current = b * 10 + sum%10
while current != num:
    temp = sum%10
    sum = b + sum%10
    b = temp
    current = b * 10 + sum%10
    count += 1


print(count)
