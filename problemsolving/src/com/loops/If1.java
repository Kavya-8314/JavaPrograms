package com.loops;

public class If1 {
	int age;
	public void voteEligibility(int age) {
		if (age>=18) 
			System.out.println("The person is Eligible for voting");
		    System.out.println("The person is not Eligible for voting");
		
	}
	public static void main(String[] args) {
		If1 obj= new If1();
		obj.voteEligibility(12);
	}
	

}
