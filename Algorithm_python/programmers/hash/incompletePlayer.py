def solution(participant, completion):
    map = {}
    for i in participant:
        map[i] = map.get(i, 0) + 1

    for i in completion:
        map[i] -= 1

    for k, v in map.items():
        if v == 1:
            answer = k
            break
    return answer


participant = ["leo", "kiki", "eden"]
completion = ["eden", "kiki"]

# participant = ["marina", "josipa", "nikola", "vinko", "filipa"]
# completion = ["josipa", "filipa", "marina", "nikola"]

# participant = ["mislav", "stanko", "mislav", "ana"]
# completion = ["stanko", "ana", "mislav"]

print(solution(participant, completion))

