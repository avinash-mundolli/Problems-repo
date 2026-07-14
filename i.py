balance = 10000
pin_code = 1234

pin = int(input("Enter the PIN code: "))

if pin == pin_code:
    while True:
        print("\n===== ATM MENU =====")
        print("1. Check Balance")
        print("2. Deposit")
        print("3. Withdraw")
        print("4. Exit")

        choice = int(input("Enter your choice: "))

        if choice == 1:
            print("Balance is:", balance)

        elif choice == 2:
            add = float(input("Enter the deposit amount: "))
            balance += add
            print("Amount deposited successfully.")
            print("New balance is:", balance)

        elif choice == 3:
            withdraw = float(input("Enter amount to withdraw: "))
            if withdraw <= balance:
                balance -= withdraw
                print("Withdrawal successful.")
                print("New balance is:", balance)
            else:
                print("Insufficient funds.")

        elif choice == 4:
            print("Exited successfully.")
            break

        else:
            print("Invalid choice. Please try again.")

else:
    print("Invalid PIN code.")