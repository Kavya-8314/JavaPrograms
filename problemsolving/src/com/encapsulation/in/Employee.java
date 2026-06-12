package com.encapsulation.in;
 class Test{
	private int empId;
	private  String name;
	private double salary;
 
	
  public void setempId(int empId){
	  this.empId=empId;
	 if(empId>0) {
		 System.out.println(empId);
	 }else {
		 System.out.println("Invalid empId");
	 }
 }
  
  public void setName(String name) {
	  this.name=name;
	  if(name!=null) {
		  System.out.println(name);
	  }else {
		  System.out.println("Invalid name");
	  }
  }
 
  
  public void setSalary(double salary) {
	  if(salary>=15000) {
		  System.out.println(salary);
	  }else {
		  System.out.println("U only work for that salary");
	  }
	 
  }
  
  
 }
public class Employee {
  public static void main(String[] args) {
	Test t=new Test();
	
	t.setempId(100);
	t.setName("Bunty");
	t.setSalary(20000.00);
	
 }

}