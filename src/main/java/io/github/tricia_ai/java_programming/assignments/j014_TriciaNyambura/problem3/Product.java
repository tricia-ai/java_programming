package io.github.tricia_ai.java_programming.assignments.j014_TriciaNyambura.problem3;

public abstract class Product {
    protected String productId;
    protected String name;
    protected double price;
    protected int stockQuantity;

    public Product(String productId, String name, double price,
                   int stockQuantity) throws InvalidProductError{
        if (productId.matches("PID\\w+")){
            this.productId = productId;
        } else {
            throw new InvalidProductError("Invalid ProductID");
        }
        this.name = name;
        if (price >= 0){
            this.price = price;
        } else {
            throw new InvalidProductError("Invalid Price");
        }
        if (stockQuantity >= 0){
            this.stockQuantity = stockQuantity;
        } else {
            throw new InvalidProductError("Invalid Stock Quantity");
        }
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public abstract double calculateDiscount();
    public abstract String getProductType();
    public double applyTax(){
        double taxable = getPrice() * 0.16;
        price -= taxable;
        return price;
    }
    public int reduceStock(int quantity) throws OutofStockError{
        if (getStockQuantity() > quantity){
            int newStockQuantity = getStockQuantity() - quantity;
            newStockQuantity = stockQuantity;
            return stockQuantity;
        } else {
            throw new OutofStockError("Item is out of stock");
        }
    }

    public String displayInformation() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                '}';
    }
}
