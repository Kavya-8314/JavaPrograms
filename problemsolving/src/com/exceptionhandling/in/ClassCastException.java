package com.exceptionhandling.in;
class Animal{
	
}
class Dog extends Animal{
   public static void Bark() {
	   System.out.println("Dog is Barking as Bow- Bow");
   }
}
public class ClassCastException {
  public static void main(String[] args) {
	Animal a=new Dog();//Animal a=new Animal();
	Dog d=(Dog)a;
	d.Bark();
}
}
