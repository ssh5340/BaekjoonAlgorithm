n, m = map(int, input().split())
answer = []

for t in range(1, n+1):
    answer.append(t)    

for i in range(m):
    a, b = map(int, input().split())
    result = answer[a-1:b]
    result.reverse()
    answer[a-1:b] = result

print(*answer)