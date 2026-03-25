package Day44;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int a = reader.nextInt();
		int b = reader.nextInt();
		int[] w = new int[n];
		for (int i = 0; i < n; i++) {
			w[i] = reader.nextInt();
		}
		int[][] dp = new int[a + 1][b + 1];
		for (int i = 1; i <= n; i++) {
			int v = w[i - 1];
			for (int j = a; j >= 0; j--) {
				for (int k = b; k >= 0; k--) {
					if (j >= v) {
						dp[j][k] = Math.max(dp[j][k], dp[j - v][k] + v);
					}
					if (k >= v) {
						dp[j][k] = Math.max(dp[j][k], dp[j][k - v] + v);
					}
				}
			}
		}
		System.out.println(dp[a][b]);
		reader.close();
	}

}
