N = int(input())

rejected = 0
pc = []
want = list(map(int, input().split()))
for i in want:
    if pc.__contains__(i):
        rejected += 1
    else:
        pc.append(i)

print(rejected)
