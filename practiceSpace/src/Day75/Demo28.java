package Day75;

import java.util.Scanner;

public class Demo28 {

	private static final double PI = 3.1415926;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		double a = reader.nextDouble();
		double b = reader.nextDouble();
		double area = PI * a * b;
		System.out.printf("Area = %.6f\n", area);
	}

}
