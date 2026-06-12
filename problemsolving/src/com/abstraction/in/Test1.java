package com.abstraction.in;

interface Shape2{
	void draw();
}
class Rectangle2 implements Shape2{
	public void draw() {
		System.out.println("Rectangle is drawn");
	}
}
class Square2 implements Shape2{
	public void draw() {
		System.out.println("Square is drawn");
	}
}
class Circle2 implements Shape2{
	public void draw() {
		System.out.println("circle is drawn");
	}
}
class shapes{
	void allowShape(Shape2 ref) {
		ref.draw();
	}
}
public class Test1 {
 public static void main(String[] args) {
	 Rectangle2 r=new Rectangle2();
	 Square2 s=new Square2();
	 Circle2 c=new Circle2();
	 shapes s1=new shapes();
	 s1.allowShape(r);
	 s1.allowShape(s);
	 s1.allowShape(c);
	 
	 
	 
}
}
