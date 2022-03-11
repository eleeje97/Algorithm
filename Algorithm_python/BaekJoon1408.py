current_h, current_m, current_s = map(int, input().split(':'))
end_h, end_m, end_s = map(int, input().split(':'))

current = current_h * 3600 + current_m * 60 + current_s
end = end_h * 3600 + end_m * 60 + end_s

if end < current:
    end += 24 * 3600

left = end - current
left_h = left // 3600
left = left % 3600
left_m = left // 60
left_s = left % 60

print('%02d:%02d:%02d' % (left_h, left_m, left_s))
