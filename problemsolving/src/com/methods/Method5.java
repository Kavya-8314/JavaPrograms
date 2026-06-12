package com.methods;
//Non static method without returntype and without parameter
public class Method5 {
	public void Subtraction() {
		System.out.println("Non Static Method");
	}
	public static void main(String[] args) {
		Method5 obj=new Method5();
		obj.Subtraction();
	}

}
