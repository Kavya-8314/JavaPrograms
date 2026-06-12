package com.inheritance.in;

class Person{
	String name="Chandu";
	void speak() {
		System.out.println(name + " is speaking");
	}
}
class Teaching extends Person{
	String subject="Java";
	void teach() {
		System.out.println( name+ " is teaching");
	}
}
class JavaWorkshop extends Teaching{
	void javaWorkShop() {
		System.out.println( name+ " is doing workshop");
	}
}
public class Multilevel {
  public static void main(String[] args) {
	  JavaWorkshop jp=new JavaWorkshop();
	  System.out.println("JavaWorkshop properties and behavior");
	  jp.javaWorkShop();
	  System.out.println("-----------------------");
	  System.out.println("Teaching properties and behavior");
	  System.out.println(jp.subject);
	  jp.teach();
	  System.out.println("-----------------------");
	  System.out.println("Person properties and behavior");
	  System.out.println(jp.name);
	  jp.speak();
	  
	  
	
}
}
