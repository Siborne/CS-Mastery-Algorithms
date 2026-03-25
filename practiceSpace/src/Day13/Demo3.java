package Day13;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int m = reader.nextInt();
		int k = reader.nextInt();
		int[] w = new int[n];
		int[] v = new int[n];
		for (int i = 0; i < n; i++) {
			w[i] = reader.nextInt();
			v[i] = reader.nextInt();
		}

		int[][] dp = new int[2][m + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = m; j >= 0; j--) {
				if (j >= w[i - 1]) {
					dp[0][j] = Math.max(dp[0][j], dp[0][j - w[i - 1]] + v[i - 1]);
					dp[1][j] = Math.max(dp[1][j], dp[1][j - w[i - 1]] + v[i - 1]);
				}
				if (j >= w[i - 1] + k) {
					dp[1][j] = Math.max(dp[1][j], dp[0][j - w[i - 1] - k] + v[i - 1] * 2);
				}
			}
		}

		System.out.println(Math.max(dp[0][m], dp[1][m]));

	}

}
