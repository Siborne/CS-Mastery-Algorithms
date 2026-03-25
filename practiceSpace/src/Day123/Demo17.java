package Day123;

import java.util.Scanner;

public class Demo17 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextInt()) {
			int n = reader.nextInt();
			double max = Double.MIN_VALUE;
			double min = Double.MAX_VALUE;
			double sum = 0;
			for (int i = 0; i < n; i++) {
				double x = reader.nextDouble();
				max = Math.max(max, x);
				min = Math.min(min, x);
				sum += x;
			}
			sum -= (max + min);
			sum /= (n - 2);
			System.out.println(String.format("%.2f", sum));
		}

		reader.close();
	}

}
