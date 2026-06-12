package com.exceptionhandling.in;

class ALessThanBException extends Exception{
	public static String Message() {
		return " a is less than b,so negative values are not allowed";
	}
}
public class CustomException {
  public static void main(String[] args) {
	try {
		int a=5,b=10;
		if(a<b) {
			throw new ALessThanBException();
		}
	
		int c=a-b;
		System.out.println(c);
	}
		catch(ALessThanBException e) {
			System.out.println(e.Message());
		}
	
}
}
