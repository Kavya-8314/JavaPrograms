package com.constructors.in;
//for no parameterized constructor we have to initialize the values.
//for parameterized we will give the values at the time of object creation.
public class Constructor6 {
	
	Constructor6(){
		int id=1;
		String name="kavya";
		System.out.println(id+"\n"+name);
		
	}
	Constructor6(int a){
		System.out.println(a);
	}
	public static void main(String[] args) {
		Constructor6 c=new Constructor6(10);
		Constructor6 c1=new Constructor6(20);
		
		
		
	}
}
