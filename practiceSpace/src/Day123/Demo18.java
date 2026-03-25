package Day123;

import java.util.Scanner;

public class Demo18 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextInt()) {
			int n = reader.nextInt();
			int m = reader.nextInt();

			StringBuilder sb = new StringBuilder();
			int sum = 0;
			for (int i = 1, x = 2; i <= n; i++, x += 2) {
				sum += x;
				if (i % m == 0) {
					sum /= m;
					sb.append(sum).append(" ");
					sum = 0;
				}
			}
			if (n % m != 0) {
				sb.append(sum);
			}
			System.out.println(sb.toString());
		}

		reader.close();
	}

}
