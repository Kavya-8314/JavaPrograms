package com.exceptionhandling.in;

public class ManualExceptionATM {
	public static void ATMmachine(int balance,int withdrawl) {
		if(withdrawl>balance) {
			throw new ArithmeticException("Insufficient Balance");
		}
	}
  public static void main(String[] args) {
	  try {
		  ATMmachine(3000,5000);
	  }
	  catch(Exception e) {
		  System.out.println(e.getMessage());
		  e.printStackTrace();
	  }
	  finally {
		  System.out.println("collect your card");
	  }
}
}
