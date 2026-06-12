package com.methods;
public class Circle{
	int radius ;
	double pi=3.14;
	
	public double Circumference() {
		return 2*pi*radius;
	}
	
	public double Area() {
		return pi*radius*radius;
	}
	
	public void initializevalues(int radius) {
		this.radius=radius;
		
	}
	
	public void display() {
		//double circumference=2*pi*radius;
		//double Area=pi*radius*radius;
		System.out.println("Circumference of the circle:"+ Circumference()+"\nArea of the Circle:"+ Area());
	}
	
	
	
	/*public static void main(String[] args) {
		Circle c1=new Circle();
		c1.initializevalues(6);
		c1.display();
		
	}*/
}

	