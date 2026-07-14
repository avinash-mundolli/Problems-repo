import time
def bs():
    qu=int(input("enter quality: "))
    bil=qu*20
    print("Amount is :",bil+12)
    time.sleep(5)
    print("collect u r recept")

print("Wlcome to Ranga's Ice Creams")
op=input("Menu\n1.Bc--20\n2.Bc--10\n.3.vanilla--20")
if op=="1":
    bs()