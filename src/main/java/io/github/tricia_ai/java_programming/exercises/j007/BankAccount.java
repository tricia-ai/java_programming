package io.github.tricia_ai.java_programming.exercises.j007;

public class BankAccount {
    public String accountNumber;
    public String accountHolder;
    public double balance;

    public BankAccount(){
        this.accountNumber = "Unknown";
        this.accountHolder = "Unknown";
        this.balance = 0.0;

    }

    public BankAccount(String accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public BankAccount(String accountNumber, String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposit: "+amount+" Balance: "+balance);
        } else {
            System.out.println("The amount should be positive");
        }

        //return balance;

    }

    public void withdraw(double amount){
        if (amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal amount: "+amount+" Balance: "+balance);
        } else {
            System.out.println("You balance is insufficient");
        }

        //return balance;
    }

    public void displayBalance(){
        System.out.println("================ Account information ======================");
        System.out.println("Account: " + accountNumber);
        System.out.println("Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}
