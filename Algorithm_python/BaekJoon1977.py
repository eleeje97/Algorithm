M = int(input())
N = int(input())

nums = []
num = 1
while num * num <= N:
    if M <= num * num:
        nums.append(num * num)
    num += 1

if len(nums) == 0:
    print(-1)
else:
    print(sum(nums))
    print(min(nums))
