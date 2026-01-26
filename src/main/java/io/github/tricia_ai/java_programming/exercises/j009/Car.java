package io.github.tricia_ai.java_programming.exercises.j009;

public class Car extends Vehicle{
    protected int doors;

    public Car(String make, String model, int year, int doors){
        super(make, model, year);
        setDoors(doors);
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Door info: "+getDoors());
    }
}
