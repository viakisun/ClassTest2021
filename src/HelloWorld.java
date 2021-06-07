public class HelloWorld {

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

	// practice #10
	private static int add(int x, int y) {
		return x + y;
	}
}
