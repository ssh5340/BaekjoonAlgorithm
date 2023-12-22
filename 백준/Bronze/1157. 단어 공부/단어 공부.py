n = input()
t = n.lower()
array = list(set(t))
answer = []

for i in array:
    cnt = t.count(i)
    answer.append(cnt)

if answer.count(max(answer)) >= 2:
    print("?")
else:
    print(array[(answer.index(max(answer)))].upper())