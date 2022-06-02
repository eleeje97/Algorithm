import re

'''
1. 모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
2. 모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
3. 같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.
'''

def isVowel(c):
    if re.match("[aeiou]", c) is not None:
        return True
    else:
        return False

while True:
    pw = input()
    if pw == 'end':
        break

    flag = True
    if re.search('[aeiou]', pw) is None:
        flag = False
    else:
        vowel_cnt = 0
        consonant_cnt = 0
        for i in pw:
            if isVowel(i):
                consonant_cnt = 0
                vowel_cnt += 1
            else:
                vowel_cnt = 0
                consonant_cnt += 1

            if consonant_cnt == 3 or vowel_cnt == 3:
                flag = False
                break

        for i in range(len(pw)-1):
            if pw[i] == pw[i+1]:
                if not (pw[i] == 'e' or pw[i] == 'o'):
                    flag = False
    if flag:
        ans = 'acceptable'
    else:
        ans = 'not acceptable'

    print(f'<{pw}> is {ans}.')
