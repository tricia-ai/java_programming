package io.github.tricia_ai.java_programming.exercises.j007;

import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student student1 = new Student("Jane Elma","ADM2001", scan);
        student1.displayInfo();

        Student student3 = new Student("Alma Zhu","ADM2020",scan);
        student3.displayInfo();

        Student student2 = new Student("Bill Grey","ADM2500",scan);
        //object referencing
        student2.displayInfo();
        Student student4 = student2;
        student2.name = "Billy Grey";
        student4.displayInfo();

        scan.close();



    }
}
