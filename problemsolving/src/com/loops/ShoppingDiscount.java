package com.loops;

public class ShoppingDiscount {
	public static void main(String[] args) {
		int purchasedAmount=1000;
		boolean prime=true;
		if(purchasedAmount>5000) {
			  if(prime) {
				System.out.println("20% Discount is applied");
			   }
			  else {
					System.out.println("10% Discount is applied");
				}
				
		  }
			else {
				System.out.println("No Discount,Dont Bargain!!!.....");
			}
		
	}

}
