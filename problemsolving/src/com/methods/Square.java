package com.methods;

public class Square{
	int side;
	
	public int Perimeter() {
		return 4*side;
	}
	
	public int Area() {
		return side*side;
	}
	
	public void initializevalues(int side) {
		this.side=side;
		
	}
	
	public void display() {
		//int Perimeter=4*side;
		//int Area= side*side;
		System.out.println("perimeter of Square:"+ Perimeter()+"\nArea of Square:"+Area());
		
	}
	/*public static void main(String[] args) {
		Square s1=new Square();
		s1.initializevalues(5);
		s1.display();
		
	}*/
}
