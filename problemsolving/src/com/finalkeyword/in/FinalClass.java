package com.finalkeyword.in;
//We cannot inherit the final class.
 final class Parent1{
	void display() {
		System.out.println("display method");
	}
}
// class Child1 extends Parent1{
//	void display() {
//		System.out.println("child class display method");
//	}
//  }
public class FinalClass {
     public static void main(String[] args) {
    	     Parent1 p1=new Parent1();
    	     p1.display();
//    	     Child1 c1=new Child1();
//    		 c1.display();
	}
}  
