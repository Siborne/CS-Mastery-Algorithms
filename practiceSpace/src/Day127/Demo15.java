package Day127;

import java.util.Scanner;

public class Demo15 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		long[] dp = new long[50];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i < dp.length; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		int n = reader.nextInt();
		while (n-- > 0) {
			int a = reader.nextInt();
			int b = reader.nextInt();
			int dist = b - a;
			System.out.println(dp[dist]);
		}

		reader.close();
	}

}
