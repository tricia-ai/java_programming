package io.github.tricia_ai.java_programming.assignments.j014_TriciaNyambura.problem2;

public class Main {
    public static void main(String[] args) {
        try {
            BankAccount account1 = new BankAccount("ACC001", "Alice", 1000);
            BankAccount account2 = new BankAccount("ACC002", "Bob", 500);
            account1.deposit(-100);  // Should throw InvalidTransactionException
            account1.withdraw(2000); // Should throw InsufficientFundsException
            account1.transfer("INVALID", 100); // Should throw AccountNotFoundException
        } catch (InsufficientFunds e) {
            System.out.println("Funds error: " + e.getMessage());
        } catch (InvalidTranscations e) {
            System.out.println("Transaction error: " + e.getMessage());
        } catch (AccountNotFound e) {
            System.out.println("Account error: " + e.getMessage());
        } finally {
            System.out.println("Transaction processing completed");
        }
    }
}
