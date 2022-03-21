a = str(format(2 ** -int(input()), '.300f'))
for i in range(len(a) - 1, 0, -1):
    if a[i] != '0':
        index = i
        break

print(a[:index+1])
