try:
    l=list(map(int,input().split(',')))
    if len(l)==10:
        print(max(l))
        print(min(l))
    else:
        print("enter 10 ")
except:
    print("enter number")