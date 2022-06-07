notes = list(map(int, input().split()))

if notes == list(range(1, 9)):
    print("ascending")
elif notes == list(range(8, 0, -1)):
    print("descending")
else:
    print("mixed")