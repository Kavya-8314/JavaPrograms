package com.abstraction.in;

import java.util.Scanner;

abstract class Shape1{
	float area;
	abstract void input();
	abstract void calArea();
	void display() {
		System.out.println("Area :"+ area);
	}
}
 class Rectangle1 extends Shape1{
	int l,b;
	 void input() {
		 Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length:");
		  l= sc.nextInt();
		  System.out.println("Enter the breadth:");
		  b= sc.nextInt();
	 }
	 void calArea() {
		 area=l*b;
	 }
 }
 class Square1 extends Shape1{
	 int a;
	 void input() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the side:");
	      a= sc.nextInt();
	 }
	 void calArea() {
		 area=a*a;
	 }
 }
 class Circle1 extends Shape1{
	float r;
	 void input() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the radius:");
		 r= sc.nextFloat();	 
	 }
	 void calArea() {
		 area=3.14f*r*r;
	 }
 }
 class Areacalculation{
	 void allowAreacal(Shape1 ref) {
		 ref.input();
		 ref.calArea();
		 ref.display();
	 }
 }

public class Main1 {
   
   public static void main(String[] args) {
	/*Rectangle1 r=new Rectangle1();
	r.input();
	r.calArea();
	r.display();
	Square1 s=new Square1();
	s.input();
	s.calArea();
	s.display();
	Circle1 c=new Circle1();
	c.input();
	c.calArea();
	c.display();*/
	Rectangle1 r=new Rectangle1();
	Square1 s=new Square1();
	Circle1 c=new Circle1();
	Areacalculation a=new Areacalculation();
	a.allowAreacal(r);
	a.allowAreacal(s);
	a.allowAreacal(c);
	
 }
}

