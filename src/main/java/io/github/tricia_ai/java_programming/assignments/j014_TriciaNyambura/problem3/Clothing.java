package io.github.tricia_ai.java_programming.assignments.j014_TriciaNyambura.problem3;

public class Clothing extends Product{
    private int size;
    private String material;
    private String color;

    public Clothing(String productId, String name,
                    double price, int stockQuantity, int size,
                    String material, String color) throws InvalidProductError {
        super(productId, name, price, stockQuantity);
        this.size = size;
        this.material = material;
        this.color = color;
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
        return super.displayInformation() +  "size=" + size +
                ", material='" + material + '\'' +
                ", color='" + color + '\'';
    }

}
