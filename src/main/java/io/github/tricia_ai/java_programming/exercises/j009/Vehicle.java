package io.github.tricia_ai.java_programming.exercises.j009;

public class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year){
        setMake(make);
        setModel(model);
        setYear(year);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void start(){
        System.out.println("The car is starting");
    }

    public void stop(){
        System.out.println("The car is stopping");
    }

    public void getInfo(){
        System.out.println("=============== Vehicle Info ===============");
        System.out.println("Make: "+getMake());
        System.out.println("Model: "+getModel());
        System.out.println("Year: "+getYear());
        System.out.println("------");
    }
}
