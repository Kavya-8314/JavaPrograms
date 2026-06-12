package com.methods;

public class Method10 {
	int n;
	
	void cube(int n) {
		//this.n=n;
		System.out.println(n*n*n);
	}
    public static void main(String[] args) {
	   
	     Method10 obj=new Method10();
	     obj.cube(5);
	}
}
