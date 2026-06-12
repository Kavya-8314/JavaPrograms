package com.loops;

public class Elseif1 {
	int marks;
	public void studentMarks(int marks) {
		if(marks>0&&marks<35) {
			System.out.println("Fail");
		}
		else if(marks>36&&marks<50){
			System.out.println("Grade D");
		}
		else if(marks>51&&marks<75) {
			System.out.println("Grade C");
		}
		else if(marks>76&&marks<90) {
			System.out.println("Grade B");
		}
		else if(marks>91&&marks<100) {
			System.out.println("Grade A");
		}
		else if(marks==-120) {
			System.out.println("Invalid Marks");
		}
		
		
	}
	
   public static void main(String[] args) {
	Elseif1 obj=new Elseif1();
	obj.studentMarks(38);
}
}
