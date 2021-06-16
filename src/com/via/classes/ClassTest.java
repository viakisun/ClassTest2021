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

	}

}
