import sys
input = sys.stdin.readline

while True:
    sides = list(map(int, input().split()))
    if sides[0] == sides[1] == sides[2]:
        if sides[0] == 0:
            break
        else:
            print("Equilateral")
    else:
        sides.sort()
        if sides[0] + sides[1] <= sides[2]:
            print("Invalid")
        else:
            if sides[0] == sides[1] or sides[1] == sides[2]:
                print("Isosceles")
            else:
                print("Scalene")
