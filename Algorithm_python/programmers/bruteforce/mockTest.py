def solution(answers):
    answer = []
    scores = [0, 0, 0]
    student_ans = [[1, 2, 3, 4, 5], [2, 1, 2, 3, 2, 4, 2, 5], [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]]

    for i, ans in enumerate(answers):
        for j in range(len(student_ans)):
            if ans == student_ans[j][i % len(student_ans[j])]:
                scores[j] += 1

    max_score = max(scores)
    for i, score in enumerate(scores):
        if score == max_score:
            answer.append(i + 1)

    return answer


# answers = [1,2,3,4,5]
answers = [1,3,2,4,2]

print(solution(answers))
