package com.exceptionhandling.in;

class InvalidMobileNo extends Exception{
	public String getMessage() {
		return "Invalid Mobile Number";
	}
}
public class MobileNumberCustomException {
	 public static void main(String[] args) {
		String mobileno="9876987698";
		try {
		if(mobileno.length()!=10||!mobileno.matches("\\d{10}")||!mobileno.matches("[6-9]{10}")) {
			throw new InvalidMobileNo();
		}
		System.out.println("Valid Mobile Number");
		}
		catch(InvalidMobileNo e) {
			System.out.println(e.getMessage());
		}
	}
}
