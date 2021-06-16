package com.via.classes;

import java.util.Arrays;
import java.util.List;

public class ClassTest {

	public static void main(String[] args) {

		// practice #12
		List<Integer> listInteger = Arrays.asList(3, 4, 5);
		Triangle triangle = new Triangle(listInteger);
		int length = triangle.getTotalSide();

		System.out.println(
				String.format("삼각형 : A-%d, B-%d, C-%d", listInteger.get(0), listInteger.get(1), listInteger.get(2)));
		System.out.println(String.format("둘레길이 : %d", length));

		// practice #13-1
		IntegerArithmeticOperation iao = new IntegerArithmeticOperation();
		iao.runOperation(20, 10);

		DoubleArithmeticOperation dao = new DoubleArithmeticOperation();
		dao.runOperation(20.5, 10.5);

		// practice #13-2
		GenericArithmeticOperation<Integer> giao = new GenericArithmeticOperation<Integer>();
		giao.runOperation(20, 10);
		
		GenericArithmeticOperation<Double> gdao = new GenericArithmeticOperation<Double>();
		gdao.runOperation(20.5, 10.5);
		
		GenericArithmeticOperation<String> gsao = new GenericArithmeticOperation<String>();
		gsao.runOperation("Kunsan", "Univ");
	}
}
