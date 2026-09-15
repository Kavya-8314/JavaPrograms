package com.bank.main;

import java.util.Scanner;

import com.bank.service.BankService;

public class BankApplication {
	public static void main(String[] args) {
		BankService bs = new BankService();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\n=====BANKING MANAGEMENT SYSTEM=====");
			System.out.println("1.Register User");
			System.out.println("2.View Accounts");
			System.out.println("3.Login User");
			System.out.println("4.Search Accounts");
			System.out.println("5.Deposit Money");
			System.out.println("6.Check Balance");
			System.out.println("7.Withdraw Money");
			System.out.println("8.Update Account");
			System.out.println("9.Delete Account");
			System.out.println("10.Admin Login");
			System.out.println("11.Exit");
			System.out.println("Enter Your Choice:");
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				bs.registerUser();
				break;
			case 2:
				bs.viewAccounts();
				break;
			case 3:
				bs.loginUser();
				break;
			case 4:
				bs.searchAccount();
				break;
			case 5:
				bs.depositMoney();
				break;
			case 6:
				bs.checkBalance();
				break;
			case 7:
				bs.withdrawMoney();
				break;
			case 8:
				bs.updateAccount();
				break;
			case 9:
				bs.deleteAccount();
				break;
			case 10:
				bs.adminLogin();
				break;
			case 11:
				System.out.println("Thank You!");
				System.exit(0);
			
			default:
				System.out.println("Invalid Choice");
			}

		}
	}
}
