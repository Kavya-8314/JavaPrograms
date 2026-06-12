package com.loops;

public class Elseif {
	int num;
	public void positiveorNegative(int num) {
		if(num>0) {
			System.out.println("Positive Number");
		}
		else if(num<0){
			System.out.println("Negative Number");
		}
		else {
			System.out.println("Zero");
		}
	}
	public static void main(String[] args) {
		Elseif obj=new Elseif();
		obj.positiveorNegative(-3);
		
		
	}

}
