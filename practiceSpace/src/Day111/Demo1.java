package Day111;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int x = reader.nextInt();
			int cnt = 0;
			for (int i = 2; i * i <= x; i++) {
				while (x % i == 0) {
					x = x / i;
					cnt++;
				}
			}

			if (x > 1) {
				cnt++;
			}

			if (cnt % 2 == 1) {
				System.out.println("kou");
			} else {
				System.out.println("yukari");
			}

		}

		reader.close();
	}

}
