package com.inheritance.in;

class Account1{
	String bankaccountholdername="bunty";
	double balance=10000;
	void deposit(int deposit) {
		System.out.println("Deposited Amount is:"+deposit);
		balance+=deposit;
		System.out.println("Available balance is:"+balance);
	}
}
class SavingsAccount extends Account1{
	void addInterest() {
		balance+=balance*0.05;
		System.out.println("Balance available after interest added:"+ balance);
	}
}
class CurrentAccount extends Account1{
	void checkoverdraft() {
		System.out.println("overdraft is available now.");
	}
}
public class Hierachical3 {
 public static void main(String[] args) {
	 SavingsAccount s=new SavingsAccount();
	 System.out.println("Savings Account");
	 s.addInterest();
	 s.deposit(5000);
	 System.out.println("-------------------------");
	 System.out.println("Current Account");
	 CurrentAccount c=new CurrentAccount();
	 c.checkoverdraft();
	 c.deposit(1000);
	 
	
}
}
