import sys
input = sys.stdin.readline

N = int(input())
switch = [True if i == 1 else False for i in list(map(int, input().split()))]

M = int(input())
for i in range(M):
    gender, num = map(int, input().split())
    if gender == 1:  # 남자
        switch = [not switch[i] if (i+1) % num == 0 else switch[i] for i in range(N)]
    else:  # 여자
        switch[num-1] = not switch[num-1]
        l = num-2
        r = num
        while l >= 0 and r < N:
            if switch[l] != switch[r]:
                break
            switch[l] = not switch[l]
            switch[r] = not switch[r]
            l -= 1
            r += 1

switch = ['1' if status else '0' for status in switch]
for i in range(0, N, 20):
    print(' '.join(switch[i:i+20]))
