N = int(input())
A = list(map(int, input().split()))
B = list(map(int, input().split()))

sum = 0
diff_dic = {}
for i in range(N):
    sum += A[i] - B[i]
    diff_dic[sum] = diff_dic.get(sum, 0) + 1

answer = 0
for k, v in diff_dic.items():
    if k == 0:
        answer += (v+1) * v // 2
    else:
        answer += v * (v-1) // 2

print(answer)
