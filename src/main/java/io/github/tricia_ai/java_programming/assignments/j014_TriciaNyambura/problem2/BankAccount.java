package io.github.tricia_ai.java_programming.assignments.j014_TriciaNyambura.problem2;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    protected int balance;

    public BankAccount(String accountNumber, String accountHolder, int balance){
        if (accountNumber.matches("224564\\d+")){
            this.accountNumber = accountNumber;
        } else {
            this.accountNumber = "Not Valid";
        }
        if (accountHolder != null){
            this.accountHolder = accountHolder;
        } else {
            this.accountHolder = null;
        }
        if (balance >= 0){
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    public String getAccountNumber() {

        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getBalance(){
        return balance;
    }

    public int deposit(int amount) throws InvalidTranscations {
        if (amount > 0){
            balance = getBalance() + amount;
            System.out.println("The new balance after depositing "+amount+" is: "+balance);
            return balance;
        } else {
            System.out.println("The amount is less than 0");
            throw new InvalidTranscations("The amount is less than 0");
        }
    }

    public int withdraw(int amount) throws InsufficientFunds {
        if (amount < getBalance()){
            balance = getBalance() - amount;
            System.out.println("The new balance after withdrawing "+amount+" is: "+balance);
            return balance;
        } else {
            System.out.println("Your balance is low");
            throw new InsufficientFunds("Your balance is low");
        }

    }

    public int transfer(String toAccount, int amount) throws AccountNotFound{
        if (getBalance() > 100 || toAccount.matches("224564\\d+")){
            balance = getBalance() - amount;
            System.out.printf("The new balance: %d%n Transferred to Account: %s%n Amount: %s%n",balance,toAccount,amount);
        } else {
            throw new AccountNotFound("Not a valid account number");
        }
        return balance;
    }
    public void displayInfo(){
        System.out.println("/////////////////////////////// Account Information ////////////////////////////////");
        System.out.println();
        System.out.println("Account Number: "+getAccountNumber()+" Account Holder: "
                +getAccountHolder()+ " Account Balance: "+getBalance());

    }
}
