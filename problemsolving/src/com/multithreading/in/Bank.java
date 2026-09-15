package com.multithreading.in;

class BankAccount{
	int balance;
	public synchronized void deposit(int amount) {
		System.out.println(Thread.currentThread().getName()+"deposited the amount of rs:"+amount);
		balance+=amount;
	}
	public synchronized void withdraw() {
//		System.out.println(Thread.currentThread().getName()+"withdrawn the amount of rs:");
	}
}
public class Bank {
  BankAccount bankacc=new BankAccount();
  
}
