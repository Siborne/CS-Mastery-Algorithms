package Day123;

import java.util.Scanner;

public class Demo14 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextInt()) {
			int m = reader.nextInt();
			while (m-- > 0) {
				int n = reader.nextInt();
				double ans = 0;
				for (int i = 1; i <= n; i++) {
					double x = 1.0 / i;
					if ((i & 1) == 0) {
						x *= -1;
					}
					ans += x;
				}
				System.out.println(String.format("%.2f", ans));
			}
		}

		reader.close();
	}

}
