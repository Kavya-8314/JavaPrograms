package com.mock.in;
//Recursive Constructor

public class Constructor {
	Constructor(){
		
		System.out.println("A");
	}
   Constructor(int a ){
//	   this(10);//recursive constructor invocation is not possible
		System.out.println("B");
	}
	
		
   public static void main(String[] args) {
	   Constructor c=new Constructor(10);
	  
	
	
}
}
