package com.exceptionhandling.in;

class InvalidMobileNumber extends Exception{
	public String getMessage() {
		return "Invalid Mobile number ";
	}
}
public class MobileCustomException {
   public static void main(String[] args) {
	try {
		String mobile="8908174252";
		if(mobile.length()!=10 || !mobile.matches("\\d{10}")){
			throw new InvalidMobileNumber();
		}
		System.out.println("Valid Mobile Number");
	 }
		catch(InvalidMobileNumber e) {
			System.out.println(e.getMessage());
		}
	}
}
 
