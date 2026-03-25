package Day76;

import java.util.Scanner;

public class Demo11 {

	private static final double PI = 3.1415926;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		double r = reader.nextDouble();
		double h = reader.nextDouble();

		double ans = PI * r * r * h / 3;

		System.out.println(String.format("%.6f", ans));

		reader.close();
	}

}
