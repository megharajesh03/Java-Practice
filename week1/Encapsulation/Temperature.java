//Encapsulation2
package com.demo;

class Temperature {
    private double celsius;

    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double toFahrenheit() {
        return (celsius * 9/5) + 32;
    }

    public void displayTemperature() {
        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Temperature in Fahrenheit: " + toFahrenheit());
    }
    public static void main(String[] args) {
        Temperature temp = new Temperature(25.0);

        temp.displayTemperature();

        temp.setCelsius(30.0);

        System.out.println("\nUpdated Temperature:");
        temp.displayTemperature();
    }
}

