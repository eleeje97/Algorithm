T = int(input())

for i in range(T):
    input()
    N, M = map(int, input().split())
    sejun = list(map(int, input().split()))
    sebi = list(map(int, input().split()))

    sejun_max = max(sejun)
    sebi_max = max(sebi)
    if sejun_max >= sebi_max:
        print("S")
    elif sejun_max < sebi_max:
        print("B")
