package com.methods;

public class SquareResult {
	public static void main(String[] args) {
		Square s1=new Square();
		s1.initializevalues(5);
	    s1.display();
	    System.out.println("-------------------------");
	    Circle c1= new Circle();
	    c1.initializevalues(4);
	    c1.display();
	    System.out.println("------------------------");
	    Rectangle r1=new Rectangle();
	    r1.initializevalues(5,6);
	    r1.display();
	    
	    
	}

}
