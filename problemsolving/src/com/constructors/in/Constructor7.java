package com.constructors.in;
//we can use super without inheritance,but it is not good approach.
class Parent11{
	Parent11(){
		System.out.println("Parent class");
	}
}
class Child11 {
	
	Child11(){
         super();
		System.out.println("Child class");
	}
}
public class Constructor7 {
	
    public static void main(String[] args) {
    	Child11 c1=new Child11();
    	
	}
}

