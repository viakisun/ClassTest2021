package com.via.classes;

public class GenericArithmeticOperation<T> {
	public T add(T x, T y) {
		if (x instanceof Integer && y instanceof Integer)
			return (T)(Integer)((Integer)x + (Integer)y);
		
		if (x instanceof Double && y instanceof Double)
			return (T)(Double)((Double)x + (Double)y);
		
		if (x instanceof String)
			return (T)(String)((String)x + (String)y);
		
		assert(true);
		return null;
	}

	public T subtract(T x, T y) {
		if (x instanceof Integer && y instanceof Integer)
			return (T)(Integer)((Integer)x - (Integer)y);
		
		if (x instanceof Double && y instanceof Double)
			return (T)(Double)((Double)x - (Double)y);
		
		assert(true);
		return null;
	}

	public T multiply(T x, T y) {
		if (x instanceof Integer && y instanceof Integer)
			return (T)(Integer)((Integer)x * (Integer)y);
		
		if (x instanceof Double && y instanceof Double)
			return (T)(Double)((Double)x * (Double)y);
		
		assert(true);
		return null;
	}

	public T divide(T x, T y) {
		if (x instanceof Integer && y instanceof Integer)
			return (T)(Integer)((Integer)x / (Integer)y);
		
		if (x instanceof Double && y instanceof Double)
			return (T)(Double)((Double)x / (Double)y);
		
		assert(true);
		return null;
	}

	public void runOperation(T x, T y) {
		StringBuilder sb = new StringBuilder();
		sb.append("a=" + x + ", b=" + y + "\n");
		sb.append("사칙연산 결과: " + add(x, y) + "," + subtract(x, y) + "," + multiply(x, y) + "," + divide(x, y));
		System.out.println(sb.toString());
	}
}
