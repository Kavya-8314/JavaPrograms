package com.loops;

public class If {
	int num;
	public void positiveorNegative(int num) {
		if(num>0)
			System.out.println("Positive Number");
		    System.out.println("Negative Number");
		    System.out.println("Zero");
		}
	
 	public static void main(String[] args) {
		If obj1=new If();
		obj1.positiveorNegative(1);
		
		
		
		
	}

}
