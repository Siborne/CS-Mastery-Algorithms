package Day132;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextInt()) {
			int n = reader.nextInt();
			long ans = 0;
			if (n == 1) {
				ans = 3;
			} else {
				long pow2 = 1L << n;
				if ((n & 1) == 1) {
					ans = pow2 - 2;
				} else {
					ans = pow2 + 2;
				}
			}

			System.out.println(ans);
		}

		reader.close();
	}

}
