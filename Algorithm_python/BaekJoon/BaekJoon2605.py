N = int(input())
nums = list(map(int, input().split()))
for i in range(N):
    num = nums.pop(i)
    nums.insert(i-num, i+1)
for i in nums:
    print(i, end=' ')
    