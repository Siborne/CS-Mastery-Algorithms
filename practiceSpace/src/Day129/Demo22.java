package Day129;

import java.util.Scanner;

public class Demo22 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		double i = reader.nextDouble();
		double total = 0.0;
		double factor = 1.0;

		for (int k = 0; k <= n; k++) {
			int cash = reader.nextInt();
			total += cash / factor;
			factor *= (1 + i);
		}
		System.out.println(total);

		reader.close();
	}

}
