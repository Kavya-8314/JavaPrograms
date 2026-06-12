package com.constructors.in;
//super call
 class Parent{
	 String name;
	 int age;
	Parent(){
		
		System.out.println("Parent class No Parameterized Constructor");
	}
Parent(String name){
		this();
		System.out.println("Parent class Parameterized Constructor");
		System.out.println(name);
	}
	
}
  class Child extends Parent{

	public Child() {
		super("hidi");
		System.out.println("Child class No Parameterized Constructor");
	
	}
	

}

public class Constructor5 {
	
  public static void main(String[] args) {
	 
	 
	  Child c=new Child();
	  
}
}
