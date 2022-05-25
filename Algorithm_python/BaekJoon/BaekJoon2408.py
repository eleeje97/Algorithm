N = int(input())
formula = []
for i in range(N*2 - 1):
    formula.append(input())

index = 1
while index < len(formula):
    if formula[index] == '*':
        formula[index+1] = int(formula[index-1]) * int(formula[index+1])
        formula.pop(index-1)
        formula.pop(index-1)
    elif formula[index] == '/':
        formula[index + 1] = int(formula[index - 1]) // int(formula[index + 1])
        formula.pop(index - 1)
        formula.pop(index-1)
    else:
        index += 1

index = 1
while index < len(formula):
    if formula[index] == '+':
        formula[index+1] = int(formula[index-1]) + int(formula[index+1])
        formula.pop(index-1)
        formula.pop(index-1)
    elif formula[index] == '-':
        formula[index + 1] = int(formula[index - 1]) - int(formula[index + 1])
        formula.pop(index - 1)
        formula.pop(index-1)

print(formula[0])
