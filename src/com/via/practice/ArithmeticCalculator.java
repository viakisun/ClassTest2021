package com.via.practice;

public class ArithmeticCalculator {

	public static double add(double x, double y) {
		return x + y;
	}
	
	public static double subtract(double x, double y) {
		return x - y;
	}
	
	public static double multiply(double x, double y) {
		return x * y;
	}

	public static double divide(double x, double y) {
		
		if (y == 0) {
			System.out.println("[E] You cannot divide by zero");
			return 0;
		}

		return x * 1.0f / y;
	}
}
