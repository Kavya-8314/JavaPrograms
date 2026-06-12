package com.methods;

public class Rectangle1 {
	 int length;
	 int breadth;
	public void Perimeter() {
		System.out.println("Perimeter of the Rectangle is:"+ 2*(length+breadth));
	}
	public void Area() {
		System.out.println("Area of the rectangle is:"+length*breadth);
		
	}
	public void initializevalues(int length ,int breadth) {
		this.length=length;
		this.breadth=breadth;
		
		
	}
	public void display() {
		
		
		System.out.println("Length is :" +length + "\nBreadth is:" +breadth);
		Perimeter();
		Area();
	}
	public static void main(String[] args) {
		Rectangle1 r1=new Rectangle1();
		r1.initializevalues(4,6);
		r1.display();
		
	}

}
