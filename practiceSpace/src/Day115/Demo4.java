package Day115;

import java.util.Scanner;

public class Demo4 {

	private static double n, m, k;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		n = reader.nextDouble();
		m = reader.nextDouble();
		k = reader.nextDouble();

		double l = 0.0;
		double r = 10.0;

		while (r - l >= 0.0001) {
			double mid = (l + r) / 2.0;
			if (f(mid)) {
				r = mid;
			} else {
				l = mid;
			}
		}

		System.out.printf("%.1f\n", l * 100);

		reader.close();
	}

	private static boolean f(double x) {
		return (Math.pow(1.0 / (1.0 + x), k) >= 1 - n / m * x);
	}

}
