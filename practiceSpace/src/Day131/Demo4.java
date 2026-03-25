package Day131;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int T = reader.nextInt();
		while (T-- > 0) {
			long h = reader.nextLong();
			long x = reader.nextLong();
			long y = reader.nextLong();

			if (y == 0) {
				System.out.println("No");
			} else if (x == 0) {
				System.out.println("Yes");
			} else if (y >= x) {
				System.out.println("Yes");
			} else {
				long rounds;
				if (h % x == 0) {
					rounds = h / x;
					if (rounds * y >= x) {
						System.out.println("Yes");
					} else {
						System.out.println("No");
					}
				} else {
					rounds = h / x + 1;
					if (rounds * y >= h % x) {
						System.out.println("Yes");
					} else {
						System.out.println("No");
					}
				}

			}

		}

		reader.close();
	}

}
