package com.exceptionhandling.in;

class CarStopped extends Exception {
	public CarStopped(String message) {
		super(message);
	}
}

class CarPuncture extends Exception {
	public CarPuncture(String message) {
		super(message);
	}
}

class CarHeat extends Exception {
	public CarHeat(String message) {
		super(message);
	}
}

public class CarTest {
	public static void stop(String str)  {
		try {
			if (str.equals("stop")) {
				throw new CarStopped("Car is stopped");
			} else {
				System.out.println("Car not stalled");
			}
		}
		catch(CarStopped e) {
			System.out.println(e.getMessage());
		}
	}

	public static void puncture(String str) {
		try {
			if (str.equals("puncture")) {
				throw new CarPuncture("Car is Punctured");
			} else {
				System.out.println("Car is not punctured");
			}
		}
		catch(CarPuncture e) {
			System.out.println(e.getMessage());
		}
	}

	public static void carHeat(int temp)  {
		try {
			if (temp > 50) {
				throw new CarHeat("Car is heated more than 50 degrees");
			} else {
				System.out.println("Car not stalled");
			}
		}
		catch(CarHeat e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args)  {
    CarTest.stop("stop");
    CarTest.puncture("puncture");
    CarTest.carHeat(55);
	}
}
