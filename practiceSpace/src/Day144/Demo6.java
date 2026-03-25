package Day144;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int start = reader.nextInt();
		int end = reader.nextInt();

		int[] months = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int ans = 0;

		for (int i = 1; i <= 12; i++) {
			for (int j = 1; j <= months[i]; j++) {
				int d1 = j / 10, d2 = j % 10;
				int m1 = i / 10, m2 = i % 10;

				long y = (long) d2 * 10000000 + (long) d1 * 1000000 + (long) m2 * 100000 + (long) m1 * 10000
						+ (long) m1 * 1000 + (long) m2 * 100 + (long) d1 * 10 + (long) d2;
				if (y >= start && y <= end) {
					ans++;
				}
			}
		}
		System.out.println(ans);
		reader.close();
	}

}
