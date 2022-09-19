def solution(id_list, report, k):
    answer = [0 for _ in range(len(id_list))]
    report_board = [[0 for _ in range(len(id_list))] for _ in range(len(id_list))]
    for i in report:
        a, b = i.split()
        report_board[id_list.index(b)][id_list.index(a)] = 1

    stop_user = []
    for i, report_num in enumerate(report_board):
        if sum(report_num) >= k:
            stop_user.append(i)

    for i in stop_user:
        for j in range(len(id_list)):
            if report_board[i][j] == 1:
                answer[j] += 1

    return answer


print(solution(["muzi", "frodo", "apeach", "neo"], ["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"], 2))
print(solution(["con", "ryan"], ["ryan con", "ryan con", "ryan con", "ryan con"], 3))
