package com.constructors.in;
//Constructor is ambiguous
public class Constructor3 {
	Constructor3(int a,long b){
		System.out.println(a+b);
	}
	Constructor3(long a,int b){
		System.out.println(b+a);
	}
  public static void main(String[] args) {
//	  Constructor3 obj=new Constructor3(10,1234567899);
}
}
