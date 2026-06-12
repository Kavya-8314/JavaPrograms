package com.abstraction.in;
interface Payment{
	void pay() ;
}
class UPI implements Payment{
	public void pay(){
		System.out.println("Payment using UPI");
	}
}
class CreditCard implements Payment{
	public void pay() {
		System.out.println("Payment using CreditCard");
	}
}
public class Test4 {
    public static void main(String[] args) {
//		UPI u=new UPI();
//		u.pay();
//		CreditCard c=new CreditCard();
//		c.pay();
   
	}
}
