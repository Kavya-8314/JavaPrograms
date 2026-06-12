package com.loops;

public class Grade {
	
	public static void main(String[] args) {
		char grade='A';
		if(grade=='A') {
			System.out.println("Marks range between 91-100");
		}
		else if(grade=='B'){
			System.out.println("Marks range between 76-90");
		}
		else if(grade=='C'){
			System.out.println(" Marks range between 51-75");
		}
		else if(grade=='D'){
			System.out.println("Marks range between 36-50");
		}
		else if(grade=='F') {
			System.out.println("Marks range between 0-35");
		}
		else {
			System.out.println("Invalid Grade");
		}
		
		
	}

}
