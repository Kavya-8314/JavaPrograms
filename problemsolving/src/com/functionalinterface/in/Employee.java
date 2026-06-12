package com.functionalinterface.in;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Employee {
    String employeeName;
    String employeeDesg;
    double employeeSalary;
    public Employee(String employeeName,String employeeDesg,double employeeSalary) {
    	   this.employeeName=employeeName;
    	   this.employeeDesg=employeeDesg;
    	   this.employeeSalary=employeeSalary;
    }
    public void setemployeeName(String employeeName) {
    	  this.employeeName=employeeName;
    }
    public void setemployeeDesg(String employeeDesg) {
    	 this.employeeDesg=employeeDesg;
    }
    public void setemployeeSalary(double employeeSalary) {
    	this.employeeSalary=employeeSalary;
    }
    public String getemployeeName() {
    	   return employeeName;
    }
    public String getemployeeDesg() {
    	 return employeeDesg ;
    }
    public double getemployeeSalary() {
   	 return employeeSalary;
   }
   
    public String tostring() {
    	 return "Employee Name"+employeeName;
    }
    public String toString() {
    	   return "employeeName"+employeeName;
    }
    public static void main(String[] args) {
		Predicate<Employee> p=new Predicate<Employee>() {
			public boolean test(Employee emp) {
				return emp.getemployeeSalary()>10000 ;
			}
		};
		Consumer<Employee> c=new Consumer<Employee>() {
			public void accept(Employee emp) {
				emp.setemployeeSalary(emp.getemployeeSalary()+emp.getemployeeSalary()*0.10);
				System.out.println(emp.getemployeeSalary());
			}
		};
		Employee emp1=new Employee("Kittu","SE",100000.0);
		Employee emp2=new Employee("Singam","Police",50000.0);
		Employee emp3=new Employee("Lucky","Saleslead",5000.0);
		
		Employee emp[]= {emp1,emp2,emp3};
		for(Employee i:emp) {
			if(p.test(i)) {
				c.accept(i);
			}
		}
		
	}
}
