from heapq import heappush, heappop
import sys

input = sys.stdin.readline

N = int(input())
nums = []
for i in range(N):
    num = int(input())
    if num == 0:
        if len(nums) > 0:
            print(-heappop(nums))
        else:
            print(0)
    else:
        heappush(nums, -num)
