a = [
    [1, 2, 3],
    [4, 5, 6]
]

b = [
    [7, 8],
    [9, 10],
    [11, 12]
]

res = []

for i in range(len(a)):
    row = []
    for j in range(len(b[0])):
        value = 0
        for k in range(len(b)):
            value += a[i][k] * b[k][j]
        row.append(value)
    res.append(row)

for i in res:
    print(i)