name=input("enter the name: ")
for i in range(len(name)):
    if name.isalpha():
        if i%2==0:
            if name[i]=='Z':
                print("A",end=" ")
            elif name[i]=="z":
                print("a",end=" ")
            else:
                print(chr(ord(name[i])+1),end=" ")
        else:
            print(name[i],end=" ")
