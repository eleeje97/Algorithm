nums = []
for i in range(5):
    nums.append(int(input()))
nums.sort()
print(sum(nums)//len(nums))
print(nums[len(nums)//2])
