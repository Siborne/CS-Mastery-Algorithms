package Day127;

import java.util.Scanner;

public class Demo8 {

	private static final int MOD = (int) 1e9 + 7;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int k = reader.nextInt();

		int[][] dp = new int[n + 1][k];
		dp[0][0] = 1;

		for (int i = 0; i < n; i++) {
			for (int r = 0; r < k; r++) {
				if (dp[i][r] == 0) {
					continue;
				}
				for (int d = 1; d <= 6; d++) {
					int newR = (r * 10 + d) % k;
					dp[i + 1][newR] = (dp[i + 1][newR] + dp[i][r]) % MOD;
				}
			}
		}

		System.out.println(dp[n][0]);

		reader.close();
	}

}
