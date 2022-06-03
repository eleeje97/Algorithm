ucpc = ['U', 'C', 'P', 'C']
s = input()

index = 0
for i in s:
    if index == 4:
        break

    if i == ucpc[index]:
        index += 1

if index == 4:
    print('I love UCPC')
else:
    print('I hate UCPC')
