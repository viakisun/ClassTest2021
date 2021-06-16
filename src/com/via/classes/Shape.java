package com.via.classes;

import java.util.List;

public class Shape {
	protected List<Integer> sides;

	public Shape(List<Integer> sides) {
		this.sides = sides;
	}

	public int getTotalSide() {
		return this.sides.stream().mapToInt(Integer::intValue).sum();
	}

	public void draw() {
		StringBuilder sb = new StringBuilder();
		sb.append("Draw(");
		for (double side : sides) {
			sb.append(side);
			sb.append(",");
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append(")");
		System.out.println(sb.toString());
	}
}
