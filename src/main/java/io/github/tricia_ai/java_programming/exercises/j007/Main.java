package io.github.tricia_ai.java_programming.exercises.j007;

public class Main {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount();
        user1.displayBalance();
        BankAccount user2 = new BankAccount("ACC2346091", "Jane Bull", 80000);
        user2.deposit(20000);
        user2.withdraw(120000);
        user2.displayBalance();

        /*
        *
        *
        * Area Class
        *
        * */
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(4);
        Rectangle rect3 = new Rectangle(3,5);

        rect1.calculateArea();
        rect2.calculateArea();
        rect3.calculateArea();
    }
}
