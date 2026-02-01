package io.github.tricia_ai.java_programming.assignments.j014_TriciaNyambura.problem3;

public class Electronics extends Product{
    private int warrantyPeriod;
    private int powerConsumption;

    public Electronics(String productId, String name,
                       double price, int stockQuantity, int powerConsumption) throws InvalidProductError {
        super(productId, name, price, stockQuantity);
        setWarrantyPeriod(5);
        setPowerConsumption(powerConsumption);
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public double getDiscount(int rate){
        double discount = price * rate / 100;
        return discount;
    }

    @Override
    public int reduceStock(int quantity) throws OutofStockError {
        return super.reduceStock(quantity);
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
        return super.displayInformation() + "warrantyPeriod=" + warrantyPeriod +
                ", powerConsumption=" + powerConsumption;
    }

}
