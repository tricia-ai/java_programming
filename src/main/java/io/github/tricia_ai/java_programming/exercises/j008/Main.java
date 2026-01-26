package io.github.tricia_ai.java_programming.exercises.j008;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("189064","James Baldwin", 12, 3.2);
        student1.displayInfo();
        Student student2 = new Student("18905","JL", 18, 3.25);


        student2.displayInfo();

        Temperature temp = new Temperature(32.7);
        temp.displayInfo();
    }
}
