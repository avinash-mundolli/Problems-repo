name1=input("enter first name: ")
name2=input("enter last name: ")
new=name1[-2:]+name2[0:2]
print(new[::-1])