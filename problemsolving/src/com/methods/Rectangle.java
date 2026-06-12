package com.methods;

public class Rectangle {
	int length;
	int breadth;
	public int Perimeter() {
		return 2*(length+breadth);
	}
	public int Area() {
		return length*breadth;
		
	}
	public void initializevalues(int length,int breadth) {
		//this.length=length;
		//this.breadth=breadth;
		
	}
	public void display() {
		//int Perimeter=2*(length+breadth);
		//int Area=length*breadth;
		System.out.println("Perimeter of the Rectangle:"+Perimeter()+"\nArea of the Rectangle:"+Area());
		
	}
	public static void main(String[] args) {
		Rectangle r1= new Rectangle();
		r1.initializevalues(5,6);
		r1.display();
	}

}
