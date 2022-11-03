import sys
input = sys.stdin.readline


def recursive(s, t):
    if s == t:
        return 1
    if s in t or ''.join(reversed(list(s))) in t:
        return recursive(s+'A', t) + recursive(''.join(reversed(list(s+'B'))), t)
    else:
        return 0


S = input().rstrip()
T = input().rstrip()

if recursive(S, T) > 0:
    print(1)
else:
    print(0)

