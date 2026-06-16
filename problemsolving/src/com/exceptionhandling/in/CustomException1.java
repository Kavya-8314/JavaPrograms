package com.exceptionhandling.in;

class InvalidAgeOfVehicleException extends Exception{
	public InvalidAgeOfVehicleException(String message) {
		super(message);
	}
}
class InvalidAgeOfTireException extends Exception{
	public InvalidAgeOfTireException(String message) {
		super(message);
	}
}
class InvalidAgeOfEngineException extends Exception{
	public InvalidAgeOfEngineException(String message) {
		super(message);
	}
}
class Vehicle{
	public void checkAge(int ageOfvehice,int ageOfTire,int ageOfEngine) throws InvalidAgeOfVehicleException,InvalidAgeOfTireException, InvalidAgeOfEngineException{
		if(ageOfvehice>10) {
			throw new InvalidAgeOfVehicleException("Invalid age");
		}else if(ageOfTire>2) {
			throw new InvalidAgeOfTireException("Invalid Tire");
		}else if(ageOfEngine>15) {
			throw new InvalidAgeOfEngineException("Invalid Engine");
		}else {
			System.out.println("Valid vehicle");
		}
	}
}
public class CustomException1 {
public static void main(String[] args) {
	try {
		new Vehicle().checkAge(11,3,16);
	}catch(Exception e) {
		e.printStackTrace();
//		System.out.println(e.getMessage());
	}
	System.out.println("Hello");
}
}
