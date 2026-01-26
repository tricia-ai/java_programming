package io.github.tricia_ai.java_programming.exercises.j009;

public class Student extends UniveristyPerson{
    protected String major;
    protected double gpa;

    public Student(String id, String name, String email, String major, double gpa){
        super(id, name, email);
        this.major = major;
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        String studentInfo = "Major: "+major+" GPA: "+gpa;
        return super.toString() + studentInfo;
    }
}
