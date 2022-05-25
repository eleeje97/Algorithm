N, m, M, T, R = map(int, input().split())

count = 0
pulse = m

if T > M-m:
    print(-1)
else:
    while N > 0:
        if pulse + T <= M:
            pulse += T
            N -= 1
            count += 1
        else:
            if pulse - R < m:
                pulse = m
                count += 1
            else:
                pulse -= R
                count += 1
    print(count)
