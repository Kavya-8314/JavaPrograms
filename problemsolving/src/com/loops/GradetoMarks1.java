package com.loops;

public class GradetoMarks1 {
 public static void main(String[] args) {
	 char grade='g';
	if(grade=='A'||grade=='a'||grade=='B'||grade=='b'||grade=='C'||grade=='c'||grade=='D'||grade=='d'||grade=='F'||grade=='f') {
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
		 else  {
			System.out.println("Marks range between 0-35");
		 }
	 }
		else {
			System.out.println("Invalid Grade");
		}
	}
}

