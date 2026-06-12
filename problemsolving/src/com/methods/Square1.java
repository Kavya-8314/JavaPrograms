package com.methods;

public class Square1 {
	double side;
	public void Perimeter() {
		System.out.println("Perimeter of the Square:"+ 4*side);
	}
	public void Area() {
		System.out.println("Area of the Square:"+ side*side);
	}
	public void initializevalues(int side) {
		this.side=side;
		
	}
	public void display() {
		System.out.println("Side is:"+side);
		Perimeter();
		Area();
	}
	public static void main(String[] args) {
		Square1 s1=new Square1();
		s1.initializevalues(7);
		s1.display();
		
	}

}
