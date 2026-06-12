package com.encapsulation.in;

import java.util.Scanner;

//Encapsulation
public class ATM {
	private int pin;
	public void setPin(int pin) {
		if(pin>=1000 && pin<=9999) {
			System.out.println("Valid pin");
			this.pin=pin;
		}
		else {
			System.out.println("Invalid pin");
		}
	}
	public int getPin() {
		return pin;
	}
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the pin:");
       int i= sc.nextInt();
		ATM a=new ATM();
		a.setPin(i);
		System.out.println("ATM pin is:"+a.getPin());
	}
}
