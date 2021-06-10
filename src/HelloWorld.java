public class HelloWorld {
	
	// 한글인코딩 테스트
	// GURUTESTGIMJE

	public static void main(String[] args) {
		System.out.println("Hello world!");

		// practice #1
		System.out.println("Practice #1 : " + celsiusToFahrenheit(32));

		// practice #2
		System.out.println("Practice #2 : " + sumFromTo(1, 100));

		// practice #3
		printMultiplicationTable();

		// practice #4
		printStars(5);

		// practice #5
		calculateGradePoint(53);
		calculateGradePoint(61);
		calculateGradePoint(71);
		calculateGradePoint(83);
		calculateGradePoint(90);

		// practice #6
		calculateSumAndAverage();

		// practice #7
		calculateMultiArraySumAndAverage();
		
		// practice #8
		String strFlipInput = "Kunsan University 2021";
		flipCase(strFlipInput);

		// practice #10
	}

	// practice #1
	private static float celsiusToFahrenheit(float temperature) {
		return temperature * 9 / 5.0f + 32;
	}

	// practice #2
	private static long sumFromTo(int x, int y) {

		long value = 0;
		for (int i = x; i <= y; i++) {
			value += i;
		}

		return value;
	}

	// practice #3
	private static void printMultiplicationTable() {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(String.format("%d x %d = %d", i, j, i * j));
			}
		}
	}

	// practice #4
	private static void printStars(int count) {

		if (count < 1) {
			System.out.println("[E] Not enough stars");
			return;
		}

		for (int i = 1; i <= count; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print('*');
			}

			System.out.println();
		}
	}

	// practice #5
	private static void calculateGradePoint(int score) {

		String strGradePoint = "";

		if (score >= 90) {
			strGradePoint = "A";
		} else if (score >= 80) {
			strGradePoint = "B";
		} else if (score >= 70) {
			strGradePoint = "C";
		} else if (score >= 60) {
			strGradePoint = "D";
		} else {
			strGradePoint = "F";
		}

		System.out.println(String.format("%d is grade %s", score, strGradePoint));
	}

	// practice #6
	private static void calculateSumAndAverage() {

		final int STUDENT_COUNT = 10;

		String strInput = "90, 28, 85,99,65,  76 ,72,84,80, 72";
		strInput = strInput.replace(" ", "");

		String[] arrInput = strInput.split(",");
		if (arrInput.length != STUDENT_COUNT) {
			System.out.println("[E] Wrong student count");
			return;
		}

		int sum = 0;

		for (int i = 0; i < STUDENT_COUNT; i++) {
			try {
				int score = Integer.parseInt(arrInput[i]);
				sum += score;
			} catch (NumberFormatException ex) {
				System.out.println(ex.toString());
				System.out.println("[E] Cannot parse number");
				return;
			}
		}

		System.out.println(String.format("Sum %d, Avg %d", sum, sum / STUDENT_COUNT));
	}

	// practice #7
	private static void calculateMultiArraySumAndAverage() {
		int[][] scores = { { 90, 80, 80 }, { 85, 85, 90 }, { 95, 70, 75 }, { 80, 80, 90 }, { 90, 75, 80 }, };
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			for (int score : scores[i]) {
				sum += score;
			}

			System.out.println(String.format("[%d] sum : %d , avg : %d", i + 1, sum, sum / scores[i].length));
		}
	}
	
	// practice #8
	private static void flipCase(String strInput) {
		
		String strOutput = "";
		
		for (int i = 0; i < strInput.length(); i++) {
			char character = strInput.charAt(i);
			
			if (Character.isUpperCase(character)) {
				strOutput += Character.toLowerCase(character);
			}
			else {
				strOutput += Character.toUpperCase(character);
			}
		}
		
		System.out.println(String.format("[Input] : %s", strInput));
		System.out.println(String.format("[Output] : %s", strOutput));
	}

	// practice #10
	private static int add(int x, int y) {
		return x + y;
	}

	private static int divide(int x, int y) {
		// TODO :: vincent : 20210609 : divide by zero problem
		return x / y;
	}
}
