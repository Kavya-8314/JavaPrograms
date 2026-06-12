package com.finalkeyword.in;

public class FinalClass2 {
  final int a;
  FinalClass2(int a){
	  this.a=a; 
	  }
  public static void main(String[] args) {
	  FinalClass2 fc2=new FinalClass2(10);
	  System.out.println(fc2.a);
}
}
