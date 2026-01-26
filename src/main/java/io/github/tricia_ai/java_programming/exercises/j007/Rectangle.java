package io.github.tricia_ai.java_programming.exercises.j007;

public class Rectangle {
    public double width;
    public double height;

    public Rectangle(){
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(double side){
        this.width = side;
        this.height = side;
    }

    //did not think of this
    public boolean isSquare(){
        boolean status;
        if (width == height){
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    public void calculateArea(){
        double area = width * height;
        System.out.println("=============== Area Calculation ===============");
        System.out.println("Width: "+width+" Height: "+height+" Area: "+area);
        System.out.println("Is Square: "+isSquare());
        //return area;
    }
}
