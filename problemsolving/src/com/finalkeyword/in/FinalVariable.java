package com.finalkeyword.in;
//we can't change the final variable value.
public class FinalVariable {
	final int b=30;
//	b=40;// we cant reassign the variables.
	
     public static void main(String[] args) {
		/*final int a;
		a=20;
		System.out.println(a);*/
    	 FinalVariable fv=new  FinalVariable();
    	  System.out.println(fv.b);
	}
}
