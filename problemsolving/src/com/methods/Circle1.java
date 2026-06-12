package com.methods;

public class Circle1 {
	int radius;
	double pi=3.14;
	public void Circumference() {
		System.out.println("Circumference of the Circle:"+ 2*pi*radius);
	}
	public void Area() {
		System.out.println("Area of the Circle:"+ pi*radius*radius);
	}
	public void initializevalues(int radius) {
		this.radius=radius;
		}
	public void display() {
		System.out.println("Radius is:"+radius);
		Circumference();
		Area();
		
	}
	public static void main(String[] args) {
		Circle1 c1=new Circle1();
		c1.initializevalues(5);
		c1.display();
		
	}

}
