package com.ExceptionHandling;
//Create a class called TemperatureConverter with a method convertToFahrenheit that converts Celsius to Fahrenheit.
// Handle the scenario where the input temperature is below absolute zero (-273.15°C) by throwing
// an InvalidTemperatureException (a custom exception).

public class TemperatureConverter {
     public static double convertToFahrenheit(double celsius) throws InvalidTemperatureException {
         if (celsius < -273.15){
             throw new InvalidTemperatureException();
         }
         return (celsius*9/5)+32;
    }

    public static void main(String[] args) {
         try {
             double  a = convertToFahrenheit(-274.14);
             System.out.println("The fahrenheit is:" + a);

         }catch(InvalidTemperatureException i){
             System.out.println(i.getMessage());
         }

    }
}
class InvalidTemperatureException extends Exception{
    InvalidTemperatureException(){
        super("Input Temperature is below absolute zero.");
    }
    InvalidTemperatureException(String message){
        super(message);
    }
}
