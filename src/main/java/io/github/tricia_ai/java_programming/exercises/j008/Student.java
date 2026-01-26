package io.github.tricia_ai.java_programming.exercises.j008;

public class Student {
    private String studentId;
    private String name;
    private int age;
    private double gpa;

    public Student(String studentId, String name, int age, double gpa){
        setStudentId(studentId);
        setName(name);
        setAge(age);
        setGPA(gpa);

    }

    public void setStudentId(String studentId){
        if (studentId.length() == 6){
            this.studentId = studentId;
        } else {
            System.out.println("The Student ID entered is not valid");
            this.studentId = "Unknown";
        }
    }

    public void setName(String name){
        if (name != null && name.length() >= 2){
            this.name = name;
        } else {
            System.out.println("The name field should not be null or less than two characters");
            this.studentId = "Unknown";
        }
    }

    public void setAge(int age){
        if (age >= 16 || age <= 100){
            this.age = age;
        } else {
            System.out.println("You are not eligible");
            this.age = 0;
        }
    }

    public void setGPA(double gpa){
        if (gpa >= 0.0 || gpa <= 4.0){
            this.gpa = gpa;
        } else {
            System.out.println("Not a valid GPA should be between 0 & 4");
            this.gpa = 0.0;
        }
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public void displayInfo(){
        System.out.println("================ Student Information ================");
        System.out.println("Student Name: "+getName());
        System.out.println("Student ID: "+getStudentId());
        System.out.println("Student Age: "+getAge());
        System.out.println("Student GPA: "+getGpa());
        System.out.println("-------------");
    }
}
