package com.abstraction.in;

interface Shape{
	void draw();
}
class Rectangle implements Shape{
	public void draw() {
		System.out.println("Rectangle is drawn");
	}
}
class Square implements Shape{
	public void draw() {
		System.out.println("Square is drawn");
	}
}
class Circle implements Shape{
	public void draw() {
		System.out.println("circle is drawn");
	}
}
public class Test {
  public static void main(String[] args) {
	Rectangle r=new Rectangle();
	r.draw();
	Square s=new Square();
	s.draw();
	Circle c=new Circle();
	c.draw();
	
}
}
