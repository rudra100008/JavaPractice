package com.company.ExceptionPractice;
//Create a custom exception called InvalidAgeException. Write a method that checks if a person's age is valid
//(between 0 and 120). If the age is invalid, throw InvalidAgeException.

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
	super(message);
	}

}
public class AgeValidator {

	public static void main(String[] args) {
		try {
		validAge(130);
		}catch (InvalidAgeException e) {
			System.err.println(e.getMessage());
		}
	}
	public static void validAge(int age)throws InvalidAgeException {
		if (age<0 || age>120) {
			throw new InvalidAgeException("Age must be between 0 and 120.");
		}else {
			System.out.println("Valid Age: "+age);
		}
	}
}
