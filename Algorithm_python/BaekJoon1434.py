N, M = map(int, input().split())

boxes = list(map(int, input().split()))
books = list(map(int, input().split()))


pBook = 0
pBox = 0
while pBook < M:
    if boxes[pBox] >= books[pBook]:
        boxes[pBox] -= books[pBook]
        pBook += 1
    else:
        pBox += 1


print(sum(boxes))
