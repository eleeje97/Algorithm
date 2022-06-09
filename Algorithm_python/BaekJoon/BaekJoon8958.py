n = int(input())
for i in range(n):
    answer = input().split('X')
    score = 0
    for j in answer:
        score += sum(range(len(j)+1))
    print(score)
