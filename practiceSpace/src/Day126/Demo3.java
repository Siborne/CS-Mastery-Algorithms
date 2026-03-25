package Day126;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextInt()) {
			int n = reader.nextInt();
			int r = reader.nextInt();

			if (n == 0) {
				System.out.println(0);
				continue;
			}

			boolean negative = n < 0;
			n = Math.abs(n);

			StringBuilder sb = new StringBuilder();
			while (n > 0) {
				int remainder = n % r;
				if (remainder < 10) {
					sb.append((char) ('0' + remainder));
				} else {
					sb.append((char) ('A' + remainder - 10));
				}
				n /= r;
			}
			if (negative) {
				sb.append('-');
			}
			System.out.println(sb.reverse().toString());
		}

		reader.close();
	}

}
