N = int(input())

for i in range(N):
    input()
    c_num, econo_num = map(int, input().split())
    c_iq = list(map(int, input().split()))
    c_iq.sort()
    econo_iq = list(map(int, input().split()))
    c_avg = sum(c_iq)/len(c_iq)
    econo_avg = sum(econo_iq)/len(econo_iq)
    count = 0
    for j in c_iq:
        if j >= c_avg:
            break
        if j > econo_avg:
            count += 1

    print(count)
