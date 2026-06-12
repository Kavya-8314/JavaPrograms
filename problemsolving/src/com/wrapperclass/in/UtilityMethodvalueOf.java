package com.wrapperclass.in;
//Converting string to non primitive datatype
public class UtilityMethodvalueOf {
   public static void main(String [] args) {
	String s="10";
	Byte b=Byte.valueOf(s);
	System.out.println(b);
	Short s1=Short.valueOf(s);
	System.out.println(s1);
	Integer i=Integer.valueOf(s);
	System.out.println(i);
	Long l=Long.valueOf(s);
	System.out.println(l);
	Float f=Float.valueOf(s);
	System.out.println(f);
	Double d=Double.valueOf(s);
	System.out.println(d);
	Boolean b1=Boolean.valueOf(s);
	System.out.println(b1);
//	Character c=Character.valueOf(s.charAt(0));
//	System.out.println(c);
	
  }
}
