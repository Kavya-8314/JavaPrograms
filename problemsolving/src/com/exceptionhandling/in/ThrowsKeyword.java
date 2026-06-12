package com.exceptionhandling.in;

public class ThrowsKeyword {
	public static void Bank(int withdrawl,int balance) throws ArithmeticException ,ArrayIndexOutOfBoundsException{
		if(balance<withdrawl) {
			throw new ArithmeticException("Insufficient Balance");
		}
		balance=balance-withdrawl;
		System.out.println("Amount to be withdrawn is: "+ withdrawl);
		System.out.println("Remaining amount is:"+ balance);
		System.out.println("--------------------------");
		int arr[]= {10,20,30,40,50};
		System.out.println(arr[5]);
	}
	public static void main(String[] args) {
		try {
			Bank(5000,10000);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
  }
 

