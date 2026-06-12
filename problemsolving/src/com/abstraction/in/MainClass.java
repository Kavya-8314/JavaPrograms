package com.abstraction.in;

 abstract class Plane1{
	abstract void fly();
	abstract void takeOff();	
}
 class Cargo1 extends Plane{
	 void fly(){
		 System.out.println("Cargo plane is flying with Goods");
	 }
	 void takeOff() {
		 System.out.println("Cargo plane is tookoff in high altitude");
	 }
 }
 class Passenger1 extends Plane{
	 void fly(){
		 System.out.println("Passenger plane is flying with People");
	 }
	 void takeOff() {
		 System.out.println("Passenger plane is tookoff in medium altitude");
	 }
 }
 class Military1 extends Plane{
	 void fly(){
		 System.out.println("Military plane is flying with Weapons");
	 }
	 void takeOff() {
		 System.out.println("Military plane is tookoff in low altitude");
	 }
 }
 class Aeroplane{
	 void allowAeroplane(Plane ref) {
		 ref.fly();
		 ref.takeOff();
	 }
 }
 
public class MainClass {
   public static void main(String[] args) {
	   Cargo1 c=new Cargo1();
	   Passenger1 p=new Passenger1();
	   Military1 m=new Military1();
	   Aeroplane a =new Aeroplane();
	   a.allowAeroplane(c);
	   System.out.println("----------------------------");
	   a.allowAeroplane(p);
	   System.out.println("-----------------------------");
	   a.allowAeroplane(m);
	   
	
}
}
