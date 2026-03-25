package Day12;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int m = reader.nextInt();
		int[] arr = new int[n];
		int[] brr = new int[m];
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
		}
		for (int j = 0; j < m; j++) {
			brr[j] = reader.nextInt();
		}
		int[][] dp = new int[n + 1][m + 1];
		int max = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (arr[i - 1] == brr[j - 1]) {
					dp[i][j] = Math.max(dp[i - 1][j - 1] + 1, dp[i][j]);
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], Math.max(dp[i][j - 1], dp[i][j]));
				}
				max = Math.max(max, dp[i][j]);
			}
		}
		System.out.println(max);
	}

}
