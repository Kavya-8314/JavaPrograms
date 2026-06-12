package com.loops;

public class Switch {
	public static void main(String[] args) {
		String color="Red";
		switch(color) {
		case "Red":
			System.out.println("Stop");
			break;
		case "Green":
			System.out.println("Go");
			break;
		case "Yellow":
			System.out.println("Ready to go");
			break;
	   default:
		     System.out.println("Ready to stop");
		}
	}

}
