import sys
input = sys.stdin.readline

N = int(input())
nums = list(map(int, input().split()))
nums.sort()
cnt = 0
for i in range(len(nums)):
    left = 0
    right = len(nums)-1
    while left < right:
        sum = nums[left] + nums[right]
        if sum == nums[i]:
            if left == i:
                left += 1
            elif right == i:
                right -= 1
            else:
                cnt += 1
                break
        elif sum > nums[i]:
            right -= 1
        else:
            left += 1

print(cnt)
