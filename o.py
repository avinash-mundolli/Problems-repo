
numbers = [[10, 20, 30],[ 40, 50, 60,40],[70,80,90]]

sum=0
for j in range(len(numbers[0])):
    for i in range(len(numbers)):
        if j+i==len(numbers)-1:
            sum=sum+numbers[i][j]
print(sum)