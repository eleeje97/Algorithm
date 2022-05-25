N = int(input())
bases = ['A', 'G', 'C', 'T']
decode = [[0, 2, 0, 1],
          [2, 1, 3, 0],
          [0, 3, 2, 1],
          [1, 0, 1, 3]]

sequence = input()
current = bases.index(sequence[-1])
for i in range(N-2, -1, -1):
    current = decode[bases.index(sequence[i])][current]

print(bases[current])
