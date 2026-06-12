package com.finalkeyword.in;
//Assigning value to a variable by using constructor.
public class FinalClass1 {
	final int a;
	FinalClass1 (int a){
	this.a=a;
	}
    public static void main(String[] args) {
    	FinalClass1 fc=new FinalClass1 (10);
    	System.out.println(fc.a);
    	
	}
}
//we can call the constructors only by creating the object.