package Day124;

import java.util.Scanner;

public class Demo2 {

	private static final int[] coins = new int[] { 100, 50, 10, 5, 2, 1 };

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextInt()) {
			int n = reader.nextInt();
			if (n == 0) {
				break;
			}
			int ans = 0;
			while (n-- > 0) {
				int x = reader.nextInt();
				for (int i = 0; i < coins.length; i++) {
					ans += x / coins[i];
					x %= coins[i];
				}
			}
			System.out.println(ans);
		}

		reader.close();
	}

}
