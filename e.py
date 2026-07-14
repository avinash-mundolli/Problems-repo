#wap to read a number from user,check if the sum of digits of a given number is even or odd

num=input("enter the number")
if num=="":
    print("invlaid")
elif not num.isdigit():
    print("enter number")
else:
    num=int(num)
    sum=0
    while num > 0:
        sum=sum+num%10
        num=num//10

    if sum%2==0:
        print("even")
    else:
        print("odd")