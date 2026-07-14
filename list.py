l=[1,2,3,4,5]
y=[]
#print(l)
#for i in l:
# y.append(i*i)
#print(y)

#no argument no return
#argument no return value
#argument with  return
#no argument return
#global value cannot be update inside fuction but we can using global keyword
# lambada function is know as anonumus functions and lambda is keyword accept multiple variables but return single expresion

#res=lambda a,b:a+b
#print(res)

#map function
#accept two arguments and return object adress and also num of i/p is equals to num of o/p
#print(list(map(lambda i:i*i,l)))

#filter
#print(list(filter(lambda i:i%2==0,l)))

#reduce
from functools import reduce
print(reduce(lambda i,j:i+j,l))
