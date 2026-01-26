package io.github.tricia_ai.java_programming.exercises.j008;

public class Temperature {
    private double celsius;

    public Temperature(double celsius){
        setCelsius(celsius);
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double initialCelsius) {
        if (celsius >= -273.15){
            this.celsius = initialCelsius;
        }
    }

    public double getFahrenheit(){
        return calculateFahrenheit();
    }

    public double getKelvin(){
        return calculateKelvin();
    }

    public double calculateFahrenheit(){
        double fahrenheit = (getCelsius()*(9/5)) + 32;
        return fahrenheit;
    }

    public double calculateKelvin(){
        double kelvin = getCelsius() + 273.15;
        return kelvin;
    }

    public void displayInfo(){
        System.out.println("Celsius: "+getCelsius());
        System.out.println("Fahrenheit: "+getFahrenheit());
        System.out.println("Kelvin: "+getKelvin());
        System.out.println("----");
    }
}
