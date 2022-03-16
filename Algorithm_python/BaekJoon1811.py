line = input()
while line != '#':
    target, guess = line.split()
    black, grey, white = 0, 0, 0
    target = list(target)
    temp = list(guess)
    for i, guess_peg in enumerate(temp):
        if target[i] == guess_peg:
            black += 1
            temp[i] = 0
            target[i] = 1

    for i, guess_peg in enumerate(temp):
        index1 = i-1
        index2 = i+1
        if index1 >= 0 and target[index1] == guess_peg:
            grey += 1
            temp[i] = 0
            target[index1] = 1
        elif index2 < len(target) and target[index2] == guess_peg:
            grey += 1
            temp[i] = 0
            target[index2] = 1

    for i in temp:
        if target.__contains__(i):
            white += 1
            target[target.index(i)] = 1

    print(guess + ":", black, "black,", grey, "grey,", white, "white")
    line = input()
