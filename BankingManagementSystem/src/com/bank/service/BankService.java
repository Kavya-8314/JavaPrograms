package com.bank.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.bank.model.Account;
import com.bank.model.Transaction;

public class BankService {
	Scanner sc = new Scanner(System.in);
	ArrayList<Account> accounts = new ArrayList<>();
	ArrayList<Transaction> transactions = new ArrayList<>();

	public BankService() {
		loadAccounts();
	}

//1.Register User
	public void registerUser() {
		int accNo = 0;
		try {
			System.out.println("Enter AccountNumber:");
			accNo = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Invalid Input.Enter Numbers Only.");
			return;
		}
		if (accNo <= 0) {
			System.out.println("Account Number Must Be Greater Than 0");
		}
		for (Account acc : accounts) {
			if (acc.getAccountNumber() == accNo) {
				System.out.println("Account Number Already Exists");
				return;
			}
		}
		System.out.println("Enter Name:");
		String name = sc.nextLine();
		if(name.trim().isEmpty()) {
			System.out.println("Name Cannot Be Empty");
			return;
		}
		System.out.println("Enter Password:");
		String password = sc.nextLine();
		System.out.println("Enter Contact");
		String contact = sc.nextLine();
		if(!contact.matches("\\d{10}")) {
			System.out.println("Contact Number Must Be 10 digits");
			return;
		}
		double balance = 0;
		try {
			System.out.println("Enter Initial Balance");
			balance = Double.parseDouble(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Invalid Balance");
			return;
		}
		if (balance < 0) {
			System.out.println("Initial Balance Cannot Be Negative");
			return;
		}
		Account account = new Account(accNo, name, password, contact, balance);
		accounts.add(account);
		saveAccounts();
		System.out.println("Registration Successful.");
	}

//2.View Accounts
	public void viewAccounts() {
		if (accounts.isEmpty()) {
			System.out.println("No Accounts Available");
			return;
		}
		for (Account acc : accounts) {
			System.out.println(acc);
		}
	}

//3.Login User
	public boolean loginUser() {
		int accNo = 0;
		try {
			System.out.println("Enter AccountNumber:");
			accNo = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Invalid Input.Enter Numbers Only. ");
			return false;
		}

		System.out.println("Enter Password:");
		String password = sc.nextLine();

		for (Account acc : accounts) {
			if (acc.getAccountNumber() == accNo && acc.getPassword().equals(password)) {
				System.out.println("Login Successful...");
				return true;
			}
		}
		System.out.println("Invalid Credentials...");
		return false;
	}

//4.Search Accounts
	public void searchAccount() {
		int accNo = 0;
		try {
			System.out.println(" Enter AccountNumber:");
			accNo = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Invalid Input.Enter Numbers Only.");
			return;
		}
		for (Account acc : accounts) {
			if (acc.getAccountNumber() == accNo) {
				System.out.println(acc);
				return;
			}
		}
		System.out.println("Account Not Found");
	}

//5.Deposit Money
	public void depositMoney() {
		int accNo = 0;
		try {
			System.out.println("Enter AccountNumber:");
			accNo = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Invalid Input.Enter Numbers Only");
			return;
		}
		double amount = 0;
		try {
			System.out.println("Enter Deposit Amount:");
			amount = Double.parseDouble(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Invalid Amount");
			return;
		}
		if (amount <= 0) {
			System.out.println("Amount must be greater than 0");
			return;
		}

		for (Account acc : accounts) {
			if (acc.getAccountNumber() == accNo) {
				acc.setBalance(acc.getBalance() + amount);
				transactions.add(new Transaction(acc.getAccountNumber(), "DEPOSIT", amount));
				saveAccounts();
				System.out.println("Amount Deposited Successfully...");
				System.out.println("Updated Balance:" + acc.getBalance());
				return;
			}
		}
		System.out.println("Account Not Found");
	}

//6.Check Balance
	public void checkBalance() {
		int accNo = 0;
		try {
			System.out.println("Enter AccountNumber:");
			accNo = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Invalid Input.Enter Numbers Only");
			return;
		}
		for (Account acc : accounts) {
			if (acc.getAccountNumber() == accNo) {
				System.out.println("Current Balance:" + acc.getBalance());
				return;
			}
		}
		System.out.println("Account Not Found");
	}

//7.Withdraw Money
	public void withdrawMoney() {
		int accNo = 0;
		try {
			System.out.println("Enter AccountNumber:");
			accNo = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Invalid Input.Enter Numbers Only");
			return;
		}

		double amount = 0;
		try {
			System.out.println("Enter Withdrawal Amount:");
			amount = Double.parseDouble(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Invalid Amount");
			return;
		}
		if (amount <= 0) {
			System.out.println("Amount must be greater than 0");
			return;
		}
		for (Account acc : accounts) {
			if (acc.getAccountNumber() == accNo) {
				if (acc.getBalance() >= amount) {
					acc.setBalance(acc.getBalance() - amount);
					transactions.add(new Transaction(acc.getAccountNumber() ,"WITHDRAW" ,amount));
					saveAccounts();
					System.out.println("Withdrawal Successful....");
					System.out.println("Remaining Balance:" + acc.getBalance());
				} else {
					System.out.println("Insufficient Balance");
				}
				return;
			}
		}
		System.out.println("Account Not Found");
	}

//8.Update Account
	public void updateAccount() {
		int accNo = 0;
		try {
			System.out.println("Enter AccountNumber:");
			accNo = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Invalid Input.Enter Numbers Only.");
			return;
		}

		System.out.println("Enter New Name:");
		String newName = sc.nextLine();

		System.out.println("Enter New Contact Number:");
		String newContact = sc.nextLine();

		for (Account acc : accounts) {
			if (acc.getAccountNumber() == accNo) {
				acc.setName(newName);
				acc.setContact(newContact);
				saveAccounts();
				System.out.println("Account Updated Successfully");
				System.out.println(acc);
				return;
			}

		}
		System.out.println("Account Not Found");
	}

//9.Delete Account
	public void deleteAccount() {
		int accNo = 0;
		try {
			System.out.println("Enter AccountNumber:");
			accNo = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Invalid Input.Enter Numbers Only.");
			return;
		}
		Account accountToDelete = null;// ConcurrentModificationException
		for (Account acc : accounts) {
			if (acc.getAccountNumber() == accNo) {
				accountToDelete = acc;
				break;
			}
		}
		if (accountToDelete != null) {
			accounts.remove(accountToDelete);
			saveAccounts();
			System.out.println("Account Deleted Successfully");
		} else {
			System.out.println("Account Not Found");
		}
	}

	public void saveAccounts() {
		try {
			FileWriter fw = new FileWriter("accounts.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			for (Account acc : accounts) {
				String data = acc.getAccountNumber() + "," + acc.getName() + "," + acc.getPassword() + ","
						+ acc.getContact() + "," + acc.getBalance();
				bw.write(data);
				bw.newLine();
			}
			bw.close();
			System.out.println("Accounts Saved Successfully");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void loadAccounts() {
		try {
			FileReader fr = new FileReader("accounts.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			line = br.readLine();
			while (line != null) {
				String data[] = line.split(",");
				int accNo = Integer.parseInt(data[0]);
				String name = data[1];
				String password = data[2];
				String contact = data[3];
				double balance = Double.parseDouble(data[4]);
				Account account = new Account(accNo, name, password, contact, balance);
				accounts.add(account);
				line = br.readLine();
			}
			br.close();
			System.out.println("Accounts Loaded Successfully");
		} catch (FileNotFoundException e) {

			System.out.println("No previous accounts found");
		} catch (IOException e) {
			System.out.println("Error while reading accounts");
		}
	}

	public void viewTransactions() {
		if (transactions.isEmpty()) {
			System.out.println("No Transactions Available");
			return;
		}
		System.out.println("\n==== TRANSACTIONS ====");
		for (Transaction t : transactions) {
			System.out.println(t);
		}
	}
//10.AdminLogin
	public void adminLogin() {
		System.out.println("Enter Admin ID:");
		String adminId = sc.nextLine();

		System.out.println("Enter Admin Password:");
		String password = sc.nextLine();

		if (adminId.equals("admin") && password.equals("admin123")) {
			System.out.println("Admin Login Successful");
			while (true) {
				System.out.println("\n==== ADMIN MENU ====");
				System.out.println("1. View All Accounts");
				System.out.println("2. Search Account");
				System.out.println("3. View Transactions");
				System.out.println("4. Total Accounts");
				System.out.println("5. Logout");

				System.out.println("Enter Choice:");
				int choice = Integer.parseInt(sc.nextLine());
				switch (choice) {
				case 1:
					viewAccounts();
					break;
				case 2:
					searchAccount();
					break;
				case 3:
					viewTransactions();
					break;
				case 4:
					totalAccounts();
					break;
				case 5:
					System.out.println("Admin Logged Out");
					return;
				default:
					System.out.println("Invalid choice");
				}
			}
		} else {
			System.out.println("Invalid Admin Credentials");
		}
	}
	public void totalAccounts() {
		System.out.println("Total Accounts:"+accounts.size());
	}
	public void searchByName() {
		System.out.println("Enter Name:");
		String name=sc.nextLine();
		
		for(Account acc:accounts) {
			if(acc.getName().equalsIgnoreCase(name)) {
				System.out.println("Account Found");
				System.out.println(acc);
				return;
			}
		}
		System.out.println("Account Not Found");
	}
}
