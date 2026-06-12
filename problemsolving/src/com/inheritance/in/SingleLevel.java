package com.inheritance.in;
//Single Level Inheritance
class Employee{
	//private int empId=1000;
	String name="Kavya";
	void work() {
		System.out.println(name +" is working fine in company");
	}
}
class Training extends Employee{
	String subject="Java";
	void teach() {
		System.out.println(name +" is teaching "+subject);
	}
}

public class SingleLevel {
  public static void main(String[] args) {
	Training t=new Training();
	System.out.println(t.subject);
	t.teach();
	//System.out.println(t.empId); //cannot access private access modifier
	System.out.println(t.name);
	t.work();
	
}
}
