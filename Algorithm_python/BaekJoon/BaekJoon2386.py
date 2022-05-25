while True:
    a = input()
    if a == '#':
        break
    alphabet = a[0]
    sentence = a[2:].lower()

    print(alphabet, sentence.count(alphabet))
