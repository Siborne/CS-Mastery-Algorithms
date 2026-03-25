package Day123;

import java.util.Scanner;

public class Demo5 {

	private static final double PI = 3.1415927;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextDouble()) {
			double r = reader.nextDouble();
			double ans = 4.0 / 3 * PI * Math.pow(r, 3);
			System.out.println(String.format("%.3f", ans));
		}

		reader.close();
	}

}
