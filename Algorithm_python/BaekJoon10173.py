while True:
    a = input()
    if a == 'EOI':
        break
    if 'NEMO' in a.upper():
        print('Found')
    else:
        print('Missing')
