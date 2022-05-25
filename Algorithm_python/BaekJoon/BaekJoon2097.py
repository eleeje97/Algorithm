N = int(input())
x = 2
y = 2

while N > x * y:
    if x * (y+1) < (x+1) * (x+1):
        y += 1
    else:
        x += 1
        y = x

print(((x-1) + (y-1)) * 2)
