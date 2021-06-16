package com.via.classes;

public class DoubleArithmeticOperation {
	public DoubleArithmeticOperation() {

	}

	public double add(double x, double y) {
		return x + y;
	}

	public double subtract(double x, double y) {
		return x - y;
	}

	public double multiply(double x, double y) {
		return x * y;
	}

	public double divide(double x, double y) {
		return x / y;
	}

	public void runOperation(double x, double y) {
		StringBuilder sb = new StringBuilder();
		sb.append("a=" + x + ", b=" + y + "\n");
		sb.append("사칙연산 결과: " + add(x, y) + "," + subtract(x, y) + "," + multiply(x, y) + "," + divide(x, y));
		System.out.println(sb.toString());
	}
}
