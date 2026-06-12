package com.constructors.in;
//altleast one should be differ in parameters
public class Constructor4 {
	 Constructor4(float a,int b){
		 System.out.println(a+b);
	 }
	 Constructor4(double a,int b){
//		System.out.println(a+b); 
	 }
  public static void main(String[] args) {
	  Constructor4 obj=new Constructor4(12.67,1234);//12.67f is float value
//12.67 is not float value ,it is double value.
}
}
