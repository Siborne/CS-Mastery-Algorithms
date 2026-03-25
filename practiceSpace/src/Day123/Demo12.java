package Day123;

import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextInt()) {
			double n = reader.nextDouble();
			int m = reader.nextInt();

			double sum = 0;
			for (int i = 0; i < m; i++) {
				sum += n;
				n = Math.sqrt(n);
			}
			System.out.println(String.format("%.2f", sum));
		}

		reader.close();
	}

}
