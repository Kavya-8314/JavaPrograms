package com.methods;
//static method without returntype and without parameter
public class Method1 {
	 public static void Addition() {
		 System.out.println("Addition of 3 and 5:"+(3+5));
	 }
    public static void main(String[] args) {
    System.out.println("Printing Addition");
    	   //Addition();
   // Method1.Addition();
    Method1 M1=new Method1();
    M1.Addition();
    System.out.println(M1);
    
    	
		
	}

}
