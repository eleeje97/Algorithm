import sys
import re

lines = sys.stdin.readlines()
for i in lines:
    print(len(re.findall("[a-z]", i)), end=' ')
    print(len(re.findall("[A-Z]", i)), end=' ')
    print(len(re.findall("[0-9]", i)), end=' ')
    print(len(re.findall(" ", i)), end=' ')
    print()
