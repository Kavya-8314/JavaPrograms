package com.abstraction.in;
//Multiple Inheritance using interface
interface Parent1{
    void display();
}
interface Parent2{
	void display() ;
}
class Child implements Parent1,Parent2{
	public void display() {
		System.out.println("Display Method");
	}
}
public class Test3 {
	
   public static void main(String[] args) {
	Child c=new Child();
	c.display();
}
}
