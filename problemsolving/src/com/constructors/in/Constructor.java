package com.constructors.in;
//calling one constructor within the another constructor using this() call
public class Constructor {
	public Constructor(){
		this(10,20);
		System.out.println("No parameterized Constructor");
	}
	public Constructor(int a, int b){
		
		System.out.println("parameterized Constructor");
		System.out.println(a+b);
		
	}
	public static void main(String[] args) {
	  Constructor obj=new Constructor();
	
	}

}
