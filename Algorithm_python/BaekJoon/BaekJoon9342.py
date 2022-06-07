import re

n = int(input())
p = re.compile("[ABCDEF]?A+F+C+[ABCDEF]?$")
for i in range(n):
    chromosome = input()
    if p.match(chromosome):
        print('Infected!')
    else:
        print('Good')
