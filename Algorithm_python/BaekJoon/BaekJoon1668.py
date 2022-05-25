N = int(input())

trophy = []
for i in range(N):
    trophy.append(int(input()))

left = 1
right = 1
current_l = trophy[0]
current_r = trophy[N-1]
for i in range(1, N):
    if current_l < trophy[i]:
        left += 1
        current_l = trophy[i]
    if current_r < trophy[N-i-1]:
        right += 1
        current_r = trophy[N-i-1]

print(left)
print(right)
