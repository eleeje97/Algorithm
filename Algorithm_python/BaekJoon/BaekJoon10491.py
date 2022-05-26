import sys
lines = sys.stdin.readlines()
for i in lines:
    if 'problem' in i.lower():
        print('yes')
    else:
        print('no')
