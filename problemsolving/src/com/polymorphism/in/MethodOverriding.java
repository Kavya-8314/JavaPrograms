package com.polymorphism.in;
class Payment{
	 public void pay() {
		 System.out.println("Processing Payment");
	 }	 
}
class UPI extends Payment{
	 public void pay() {
		 System.out.println("Paying using UPI");
	 }
}
class CreditCard extends Payment{
	 public void pay() {
		 System.out.println("Paying using Credit Card");
	 }
}
public class MethodOverriding {
	
    public static void main(String[] args) {
		Payment p=new UPI();	
		p.pay();
		Payment p1=new CreditCard();
		p1.pay();
   
	}
}
