from collections import defaultdict


def solution(survey, choices):
    answer = ''
    types = [['R', 'T'], ['C', 'F'], ['J', 'M'], ['A', 'N']]
    scores = defaultdict(int)

    for i in range(len(survey)):
        score = choices[i]
        if score < 4:
            c = survey[i][0]
            scores[c] += 4 - score
        elif score > 4:
            c = survey[i][1]
            scores[c] += score - 4

    for i in range(4):
        if scores[types[i][0]] < scores[types[i][1]]:
            answer += types[i][1]
        else:
            answer += types[i][0]

    return answer


print(solution(["AN", "CF", "MJ", "RT", "NA"], [5, 3, 2, 7, 5]))
print(solution(["TR", "RT", "TR"], 	[7, 1, 3]))
