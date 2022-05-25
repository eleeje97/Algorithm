N = int(input())

num_str = ''
index = 0
for i in range(1, N+1):
    num_str += str(i)

print(num_str.index(str(N))+1)
