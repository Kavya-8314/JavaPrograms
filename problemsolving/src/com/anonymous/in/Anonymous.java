package com.anonymous.in;

interface Animal{
	void makingSound();
}
public class Anonymous {
 public static void main(String[] args) {
	Animal ani=new Animal() {
      public void makingSound(){
    	   System.out.println("Bow Bow.....");
      }
	};
	  ani.makingSound();
}
	
}
