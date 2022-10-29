from collections import defaultdict
import math


def solution(fees, records):
    answer = []
    parking_time = defaultdict(list)
    parking_fee = {}

    for record in records:
        time, number, _ = record.split()
        parking_time[number].append(time)

    for number in parking_time.keys():
        if len(parking_time[number]) % 2 == 1:
            parking_time[number].append('23:59')

        total = 0
        for i in range(0, len(parking_time[number]), 2):
            start_h, start_m = map(int, parking_time[number][i].split(':'))
            end_h, end_m = map(int, parking_time[number][i + 1].split(':'))
            total += (end_h - start_h) * 60 + end_m - start_m

        parking_fee[number] = fees[1] + math.ceil(max(0, (total - fees[0])) / fees[2]) * fees[3]

    for i in sorted(parking_fee.keys()):
        answer.append(parking_fee[i])

    return answer


print(solution([180, 5000, 10, 600],
               ["05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN",
                "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"]))
print(solution([120, 0, 60, 591],
               ["16:00 3961 IN", "16:00 0202 IN", "18:00 3961 OUT", "18:00 0202 OUT", "23:58 3961 IN"]))
print(solution([1, 461, 1, 10], ["00:00 1234 IN"]))
