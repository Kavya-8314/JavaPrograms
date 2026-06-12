package com.constructors.in;
//copy constructor
 class Student{
	int accno;
	String name;
	double balance;
	Student(int accno,String name,double balance){
		this.accno=accno;
		this.name=name;
		this.balance=balance;
	 }
	Student(Student s){
		this.accno= s.accno;
		this.name= s.name;
		this.balance= s.balance;
	 }
	 public void display() {
		 System.out.println(accno+"\n"+name+"\n"+balance);
	 }
}
public class Constructor8 {
  public static void main(String[] args) {
	Student s1=new Student(12345,"kavya",20000);
	  s1.display();
	  Student s2=new Student(s1);
	  s2.name="karthik";
	  s2.balance=40000;
	  s1.display();
	  System.out.println();
	  s2.display();
}
}
