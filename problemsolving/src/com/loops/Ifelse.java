package com.loops;

public class Ifelse {
	int age;
	public void voteEligibility(int age) {
		if(age>=18) {
			System.out.println("The person is Eligible for Voting");
		}
		else {
			System.out.println("The Person is not Eligible for Voting");
		}
	}
	public static void main(String[] args) {
		Ifelse obj= new Ifelse();
		obj.voteEligibility(12);
		
		
	}

}
