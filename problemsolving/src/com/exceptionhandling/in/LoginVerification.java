package com.exceptionhandling.in;

public class LoginVerification {
	public static void instagram(String password)  {
		if(!password.equals("123")) {
			throw new IllegalArgumentException("Incorrect Password");
		}
	}
 public static void main(String[] args) {
	 instagram("1234");
}
}
