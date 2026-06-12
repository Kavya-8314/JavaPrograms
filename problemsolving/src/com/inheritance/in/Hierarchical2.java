package com.inheritance.in;

class Account{
	String name="Bunty";
	int balance=10000;
	void account() {
		System.out.println(name);
		System.out.println(balance);
	}
}
class Savings extends Account{
	int interest=100;
	void savings() {
		System.out.println(interest+balance);
	}
}
class Current extends Account{
	int overdraft= 2000;
	void overdraft() {
		System.out.println(overdraft+balance);
	}
	
}
public class Hierarchical2 {
	public static void main(String[] args) {
		Savings s=new Savings();
		s.savings();
		s.account();
		Current c=new Current();
		c.overdraft();
		s.account();
	}

}
