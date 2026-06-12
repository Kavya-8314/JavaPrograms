package com.abstraction.in;

interface Shapes{
	 public void display();
}
class Rectangler implements Shapes{
	public void display() {
		System.out.println("Rectangle is drawn");
	}
}
class Squares implements Shapes{
	public void display() {
		System.out.println("Square is drawn");
	}
}
public class Test2 {
    public static void main(String[] args) {
		Rectangler r=new Rectangler();
		r.display();
		Squares s=new Squares();
		s.display();
	}
}
