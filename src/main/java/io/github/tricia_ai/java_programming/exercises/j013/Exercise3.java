package io.github.tricia_ai.java_programming.exercises.j013;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int firstNumber = s.nextInt();
        System.out.println();
        System.out.print("Enter your operator(+, -, *, /): ");
        s.nextLine();
        System.out.println();
        char operator = s.next().charAt(0);
        System.out.print("Enter your second number: ");
        int secondNumber = s.nextInt();
        System.out.println();

        Calculator calc = new Calculator(firstNumber,operator,secondNumber);

        s.close();

        try{
            System.out.println("Result: "+calc.calculate());
        } catch (DivideByZero | NumberFormatException e){
            System.out.println("Error: "+e.getMessage());
        }



    }
}

class Calculator{
    private int firstNumber;
    private char operator;
    private int secondNumber;

    public Calculator(int firstNumber, char operator, int secondNumber) {
        this.firstNumber = firstNumber;
        this.operator = operator;
        this.secondNumber = secondNumber;
    }

    public int calculate() throws DivideByZero, NumberFormatException{
        int result = 0;
        switch (operator){
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':

                if (secondNumber != 0){
                    result = firstNumber / secondNumber;
                    break;
                } else {
                    throw new DivideByZero("The second number cannot be zero");
                }

            default:
                throw new NumberFormatException("Wrong operator format");
        }
        return result;
    }


}

class DivideByZero extends Exception{
    public DivideByZero(String message){
        super(message);
    }
}
