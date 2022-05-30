def isVowel(c):
    if c in ['a', 'e', 'i', 'o', 'u']:
        return True
    else:
        return False

diary = input()
answer = ''

while len(diary) > 0:
    answer += diary[0]
    if isVowel(diary[0]):
        if len(diary) > 2 and diary[1] == 'p' and diary[2] == diary[0]:
            diary = diary[2:]
    diary = diary[1:]

print(answer)
