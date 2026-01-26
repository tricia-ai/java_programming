package io.github.tricia_ai.java_programming.exercises.j009;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Toyota","Land Cruiser", 2010);
        v1.getInfo();
        Car c1 = new Car("Porsche", "Cayenne",2025,5);
        c1.getInfo();

        UniveristyPerson uni = new UniveristyPerson("135960", "John Dame", "john.dame@gmail.com");
        System.out.println(uni);

        Student student1 = new Student("135960","John Dame", "john.dame@gmail.com", "BCOM", 3.5);
        System.out.println(student1);
    }
}
