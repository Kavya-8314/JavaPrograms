package com.methods;
//Method Access Method
public class Method9 {
	public static void StaticMethod1() {
		System.out.println("StaticMethod1");
		Method9 m=new Method9();
		m.NonStaticMethod1();
	}
   public static void StaticMethod2() {
	   System.out.println("StaticMethod2");
	   StaticMethod1();
	   
	}
   public  void NonStaticMethod1() {
	   System.out.println("NonStaticMethod1");
	}
   public  void NonStaticMethod2() {
	   System.out.println("NonStaticMethod1");
	   NonStaticMethod1();
	   StaticMethod2();
  	}
   public static void main(String[] args) {
	   
	   StaticMethod1();
	   System.out.println();
	   StaticMethod2();
	   System.out.println();
	  Method9 obj=new Method9();
	  obj.NonStaticMethod1(); 
	  System.out.println();
	   obj.NonStaticMethod2(); 
}

}
