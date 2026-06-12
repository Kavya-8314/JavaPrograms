package com.encapsulation.in;

import java.util.Scanner;

public class BankAccount {
	private String accountHoldername;
	private int accountNumber;
	private double balance;
	public void setaccountHoldername(String name) {
		if(name!=null) {
		this.accountHoldername=name;
		}else {
			System.out.println("Invalid name");
		}
	}
	public String getaccountHoldername() {
		return accountHoldername;
	}
	public void setaccountNumber(int accountNumber ) {
		if(accountNumber>0) {
			this.accountNumber=accountNumber;
		}else {
			System.out.println("Invalid AccountNumber");
		}
	}
	public int getaccountNumber() {
		return accountNumber;
	}
	public void setBalance(double balance) {
		if(balance>0) {
			this.balance=balance;
		}else {
			System.out.println("Invalid balance");
		}
	}
	public double getBalance() {
		return balance;
	}
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String s=sc.next();
		System.out.println("Enter the Accountnumber:");
		int i=sc.nextInt();
		System.out.println("Enter the Balance:");
		double d=sc.nextDouble();
		BankAccount b=new BankAccount();
		b.setaccountHoldername(s);
		System.out.println("Accountholder name is:"+b.getaccountHoldername());
		b.setaccountNumber(i);
		System.out.println("AccountNumber is:"+b.getaccountNumber());
		b.setBalance(d);
		System.out.println("Balance is:"+b.getBalance());
		
	}
}
