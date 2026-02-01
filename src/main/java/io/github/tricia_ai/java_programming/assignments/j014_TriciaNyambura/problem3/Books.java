package io.github.tricia_ai.java_programming.assignments.j014_TriciaNyambura.problem3;

public class Books extends Product{
    private String author;
    private String publisher;
    private String isbn;

    public Books(String productId, String name,
                 double price, int stockQuantity,
                 String author, String publisher, String isbn) throws InvalidProductError {
        super(productId, name, price, stockQuantity);
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    public double getDiscount(int rate){
        double discount = price * rate / 100;
        return discount;
    }

    @Override
    public double calculateDiscount() {
        return getDiscount(5);
    }

    @Override
    public String getProductType() {
        return getClass().getSimpleName()+ "("+name+")";
    }

    @Override
    public String displayInformation() {
        return super.displayInformation() + "author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", isbn='" + isbn + '\'';
    }
}
