package com.constructors.in;
//constructor overloading-same constructor with different list of parameters
public class Constructor1 {
	Constructor1(){
		System.out.println("No parameterized Constructor");
	}
	Constructor1(String name){
		this();
		System.out.println("1-parameterized Constructor");
		System.out.println(name);
	}
	Constructor1(int a,int b){
		this("Bunty");
		System.out.println("2-parameterized Constructor");
		System.out.println(a+b);
	}
	Constructor1(int a,int b,int c){
	    this(10,20);
		System.out.println("3-parameterized Constructor");
		System.out.println(a+b-c);
	}
  public static void main(String[] args) {
	  Constructor1 obj=new Constructor1(10,20,3);
}
}
