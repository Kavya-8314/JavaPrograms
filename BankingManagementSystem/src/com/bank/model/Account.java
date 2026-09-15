package com.bank.model;

public class Account {
	private int accountNumber;
	private String name;
	private String password;
	private String contact;
	private double balance;

	// Constructor
	public Account(int accountNumber, String name, String password, String contact, double balance) {

		this.accountNumber = accountNumber;
		this.name = name;
		this.password = password;
		this.contact = contact;
		this.balance = balance;
	}

	// Setter for Account Number
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	// Getter for Account Number
	public int getAccountNumber() {
		return accountNumber;
	}

	// Setter for Name
	public void setName(String name) {
		this.name = name;
	}

	// Getter for Name
	public String getName() {
		return name;
	}

	// Setter for Password
	public void setPassword(String password) {
		this.password = password;
	}

	// Getter for Password
	public String getPassword() {
		return password;
	}

	// Setter for Contact
	public void setContact(String contact) {
		this.contact = contact;
	}

	// Getter for Contact
	public String getContact() {
		return contact;
	}

	// Setter for Balance
	public void setBalance(double balance) {
		this.balance = balance;
	}

	// Getter for Balance
	public double getBalance() {
		return balance;
	}

	// toString()
	@Override
	public String toString() {

		return "Account No : " + accountNumber + "\nName : " + name + "\nContact : " + contact + "\nBalance : "
				+ balance;
	}
}
