package Day84;

import java.util.Scanner;

public class Demo34 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		double a = reader.nextDouble();
		calcFunction c1 = x -> x * 3.79;
		double ans = c1.f(a);
		System.out.println(String.format("%.2f", ans));

		reader.close();
	}


	interface calcFunction {
		double f(double x);
	}

}
