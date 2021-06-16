package com.via.classes;

public class IntegerArithmeticOperation {
	public IntegerArithmeticOperation() {

	}

	public int add(int x, int y) {
		return x + y;
	}

	public int subtract(int x, int y) {
		return x - y;
	}

	public int multiply(int x, int y) {
		return x * y;
	}

	public int divide(int x, int y) {
		return x / y;
	}

	public void runOperation(int x, int y) {
		StringBuilder sb = new StringBuilder();
		sb.append("a=" + x + ", b=" + y + "\n");
		sb.append("사칙연산 결과: " + add(x, y) + "," + subtract(x, y) + "," + multiply(x, y) + "," + divide(x, y));
		System.out.println(sb.toString());
	}
}
