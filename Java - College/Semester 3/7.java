// Design a class "BankAccount" with methods for deposit and withdrawal. Create objects and perform transactions.

import java.util.Scanner;

class BankAccount {
    int balance;

    BankAccount(int balance) {
        this.balance = balance;
    }

    void deposit(int amount) {
        balance += amount;
    }

    void withdrawal(int amount) {
        if (balance < amount) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
        }
    }
    void display() {
        System.out.println("Current Balance :"+balance);
    }
    
}

class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Please enter the current balance in your account to continue");

        int balance = s.nextInt(), amount=0;
        BankAccount account = new BankAccount(balance);
        boolean shouldExit = false;

        System.out.println("Please Select Various Transactions by Pressing and in case of default or '4' the program ends :");
        System.out.println("1. Display Balance");
        System.out.println("2. Deposit Amount");
        System.out.println("3. Withdraw Amount");
        System.out.println("4. Exit");
        while(!shouldExit){
            System.out.println("Please enter your next choice:");
            int choice = s.nextInt();
            amount = 0;
            switch (choice) {
                case 1:
                    account.display();
                    break; 
                case 2:
                    amount = s.nextInt();
                    account.deposit(amount);
                    break;
                case 3:
                    amount = s.nextInt();
                    account.withdrawal(amount);
                    break;
                case 4:
                default:
                    System.out.print("So the final balance is : "+account.balance);
                    shouldExit = true;
                    break;
            }
        }
        System.out.println("Exiting the Bank..\nThank Your Please Visit us again..");
        while (s.hasNextLine()) {
            s.nextLine();
        }
        s.close();
    }
}
