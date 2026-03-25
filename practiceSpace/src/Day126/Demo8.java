package Day126;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextInt()) {
			int n = reader.nextInt();
			if (n == 0) {
				break;
			}

			int[] x = new int[n];
			int[] y = new int[n];
			for (int i = 0; i < n; i++) {
				x[i] = reader.nextInt();
				y[i] = reader.nextInt();
			}

			long sum = 0;
			for (int i = 0; i < n; i++) {
				int j = (i + 1) % n;
				sum += (long) x[i] * y[j] - (long) x[j] * y[i];
			}
			double area = Math.abs(sum) / 2.0;
			System.out.println(String.format("%.1f", area));
		}

		reader.close();
	}

}
