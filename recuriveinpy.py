def fact(n):
    if n==0:
        return 0
    else:
        return n+fact(n-1)
res=fact(5)
print(res)