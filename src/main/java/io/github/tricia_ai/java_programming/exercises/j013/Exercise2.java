package io.github.tricia_ai.java_programming.exercises.j013;

public class Exercise2 {
    public static void main(String[] args){
        StudentManagement s = new StudentManagement("Jane","SI202510");

        try {
            s.setGrade(101);
        } catch(InvalidGradeException e) {
            System.out.println("Grade invalid: "+e.outOfRange());
        }


    }

}

class StudentManagement{
    private String name;
    private String studentId;
    private int grade;

    public StudentManagement(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;

    }

    public void setGrade(int grade) throws InvalidGradeException {
        if (grade >= 0 & grade <= 100){
            this.grade = grade;
        } else {
            throw new InvalidGradeException(grade);
        }
    }
}

class InvalidGradeException extends Exception{
    private int value;

    public InvalidGradeException(int grade){
        this.value = grade;
    }

    public String outOfRange(){
        return "The grade "+value+" is out of range";
    }
}
