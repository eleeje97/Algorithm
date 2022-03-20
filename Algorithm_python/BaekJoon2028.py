T = int(input())

for i in range(T):
    num = input()
    num_len = len(num)
    num = int(num)
    square = num * num

    if str(square)[-num_len:] == str(num):
        print("YES")
    else:
        print("NO")
