package io.github.tricia_ai.java_programming.exercises.j007;
import java.util.Arrays;
import java.util.Scanner;

public class Student {
    public String name;
    public String id;
    public int[] scores;

    //default constructor
    public Student(){
        this.name = "Unknown";
        this.id = "Unknown";
    }

    // constructor to retrieve data
    public Student(String name, String id, Scanner scan){
        this.name = name;
        this.id = id;
        scores = inputGrades(scan);
    }


    public int[] inputGrades(Scanner scan){
        //Scanner scan = new Scanner(System.in);
        System.out.println("============ Enter your grades ============");
        int[] grades = new int[5];
        for (int i = 0; i< grades.length; i++){
            System.out.print("- ");
            grades [i] = scan.nextInt();
        }
        //scan.close();
        return grades;
    }

    public double calculateGPA(){
        int sum = 0;
        for (int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        double average = (double) sum / scores.length;
        double gpa = 0;
        String letter;
        if (average >= 90) {
            letter = "A";
        } else if (average >= 80) {
            letter = "B";
        } else if (average >= 70) {
            letter = "C";
        } else if (average >= 60) {
            letter = "D";
        } else if (average >= 50) {
            letter = "E";
        } else {
            letter = "F";
        }

        switch (letter){
            case "A":
                gpa = 4;
                break;
            case "B":
                gpa = 3;
                break;
            case "C":
                gpa = 2;
                break;
            case "D":
                gpa = 1;
                break;
            default:
                System.out.println("You did not succeed. Try next time!");
                gpa = 0;
        }
        return gpa;
    }

    public void displayInfo(){
        System.out.println("========= Student info =========");
        System.out.println("Name: "+this.name);
        System.out.println("ID: "+this.id);
        System.out.println("Grades: "+ Arrays.toString(scores));
        System.out.println("GPA: "+calculateGPA());


    }
}
