username = "admin"
password = "1234"
count = 0

while count < 3:
    u = input("Enter Username: ")
    p = input("Enter Password: ")

    if u == username and p == password:
        print("Login Successful")
        break
    else:
        count += 1
        print("Invalid Username or Password")

if count == 3:
    print("Too Many Attempts. Contact Administrator.")