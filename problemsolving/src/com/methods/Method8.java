package com.methods;
//Non Static Method with returntype and without parameters
public class Method8 {
	public int Subtraction() {
		System.out.println("Non Static Method");
		return 1;
	}
	public static void main(String[] args) {
		Method8 obj=new Method8();
		 System.out.println(obj.Subtraction());
		//obj.Subtraction();
	}

}
