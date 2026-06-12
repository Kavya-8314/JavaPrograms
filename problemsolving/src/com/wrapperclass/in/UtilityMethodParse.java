package com.wrapperclass.in;
//Convert string to primitive data type
public class UtilityMethodParse {
   public static void main(String [] args) {
	String s="10";
	byte b=Byte.parseByte(s);
	System.out.println(b);
	short s1=Short.parseShort(s);
	System.out.println(s1);
	int i=Integer.parseInt(s);
	System.out.println(i);
	long l=Long.parseLong(s);
	System.out.println(l);
	float f=Float.parseFloat(s);
	System.out.println(f);
	double d=Double.parseDouble(s);
	System.out.println(d);
	boolean b1=Boolean.parseBoolean(s);
	System.out.println(b1);
	
	
	
}
}
