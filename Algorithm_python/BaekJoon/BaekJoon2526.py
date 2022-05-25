N, P = map(int, input().split())
nums = []
current = N

while current not in nums:
    nums.append(current)
    current = (current*N) % P

print(len(nums) - nums.index(current))
