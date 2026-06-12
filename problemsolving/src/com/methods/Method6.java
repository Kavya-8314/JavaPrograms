package com.methods;
//Non Static Method with return type and with parameters
public class Method6 {
	public int Subtraction(int a,int b) {
		int c=a-b;
		System.out.println("Non Static Method");
		return c;
	}
	public static void main(String[] args) {
		Method6 obj=new Method6();
		int result=obj.Subtraction(10,20);
		System.out.println(result);
		//System.out.println(obj.Subtraction(40,50));
		//obj.Subtraction(60,30);
		
	}

}
