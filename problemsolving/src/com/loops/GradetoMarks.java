package com.loops;

public class GradetoMarks {
public static void main(String[] args) {
	char grade='a';
	if(grade=='A'||grade=='a') {
		System.out.println("Marks range between 91-100");
	}
	else if(grade=='B'||grade=='b'){
		System.out.println("Marks range between 76-90");
	}
	else if(grade=='C'||grade=='c'){
		System.out.println(" Marks range between 51-75");
	}
	else if(grade=='D'||grade=='d'){
		System.out.println("Marks range between 36-50");
	}
	else if(grade=='F'||grade=='f') {
		System.out.println("Marks range between 0-35");
	}
	else {
		System.out.println("Invalid Grade");
	}
	
}
}
