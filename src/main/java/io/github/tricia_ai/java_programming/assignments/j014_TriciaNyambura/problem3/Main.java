package io.github.tricia_ai.java_programming.assignments.j014_TriciaNyambura.problem3;

public class Main {
    public static void main(String[] args) {
        try {
            Product laptop = new Electronics("PIDE001", "Laptop", 999.99, 10, 200); // Invalid price
            System.out.println("Stock Remaining: "+laptop.reduceStock(5)); // More than available stock
        } catch (InvalidProductError | OutofStockError e){
            System.out.println("Funds error: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using our services");
        }
    }
}
