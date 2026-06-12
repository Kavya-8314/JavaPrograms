package com.abstraction.in;

abstract class Plane{
	abstract void fly();
	abstract void takeOff();
}
class Cargo extends Plane{
	void fly(){
		System.out.println("Cargo plane is flying with Goods");
	}
	void takeOff() {
		System.out.println("Cargo plane is tookoff in high altitude");
	}
}
	class Passenger extends Plane{
		void fly(){
			System.out.println("Passenger plane is flying with people");
		}
		void takeOff() {
			System.out.println("Passenger plane is tookoff in medium altitude");
		}
	}
	class Military extends Plane{
		void fly(){
			System.out.println("Military plane is flying with weapons");
		}
		void takeOff() {
			System.out.println("Military plane is tookoff in low altitude");
		}
	}

public class Main {
  public static void main(String[] args) {
	  Cargo c=new Cargo();
	  c.fly();
	  c.takeOff();
	  System.out.println("------------------------------");
	  Passenger p=new Passenger();
	  p.fly();
	  p.takeOff();
	  System.out.println("------------------------------");
	  Military m=new Military();
	  m.fly();
	  m.takeOff();
	  
	  
	  
	  
	
}
}
