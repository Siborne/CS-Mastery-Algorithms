package Day84;

import java.util.Scanner;

public class Demo33 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		double a = reader.nextDouble();
		double b = reader.nextDouble();
		double c = reader.nextDouble();

		calcFunction c1 = x -> x * 2.54;
		calcFunction c2 = x -> x * 0.31;
		calcFunction c3 = x -> x * 1.61;

		double ans1 = c1.f(a);
		double ans2 = c2.f(b);
		double ans3 = c3.f(c);

		System.out.println(String.format("%.2f %.2f %.2f", ans1, ans2, ans3));

		System.out.println();

		reader.close();
	}

	interface calcFunction {
		double f(double x);
	}

}
