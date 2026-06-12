package com.finalkeyword.in;
//we can't override the final methods.
class Parent{
    final void display() {
		System.out.println("Parent class display method");
	}
}
class Child extends Parent{
	
//	void display() {
//		System.out.println("Child class display method");
//	}
}
public class FinalMethod {
	
     public static void main(String[] args) {
    	 Parent p=new Parent();
    	 p.display();
    	 Child c1=new Child();
    	 c1.display();
	}
} 
