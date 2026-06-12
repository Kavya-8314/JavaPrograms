package com.methods;
//Non Static Method without returntype with parameters
public class Method7 {
	public void Subtraction(int a,int b) {
		int c=a-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Method7 obj=new Method7();
		obj.Subtraction(10,20);
	}

}
