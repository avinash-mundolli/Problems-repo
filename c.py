#wAp to read a name from the user,check if the name is lucky or not // a name is set to be lucky if name
#  starts and ends with same letter
name=input("enter the name: ")
if name !="" and name.isalpha():
    name=name.lower()
    if name[0]==name[-1:]:
        print("lucky")
    else:
        print("unlucky")
else:
    print("enter valid")