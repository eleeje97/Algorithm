nums = {}
current = 0
num = 0
lst = []
for i in range(10):
    num = int(input())
    nums[num] = nums.get(num, 0) + 1
    if current < nums[num]:
        current = nums[num]
        freq = num
    lst.append(num)


print(sum(lst)//len(lst))
print(freq)
