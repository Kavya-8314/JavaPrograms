package com.loops;

public class ATM {
	public static void main(String[] args) {
		int balance= 10000;
		int withdrawl=5000;
		if(withdrawl<=balance) {
			System.out.println("Withdrawl Successful");
			int remainingAmount=balance-withdrawl;
			System.out.println("Remaining balance is:"+ remainingAmount);
			
			
		}
		else {
			System.out.println("Insufficient Balance,Please check your balance.");
			
		}
	}

}
