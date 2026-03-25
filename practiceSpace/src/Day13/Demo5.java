package Day13;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int m = reader.nextInt();
		int[] dp = new int[m + 1];
		int[] v = new int[n];
		int[] w = new int[n];
		for (int i = 0; i < n; i++) {
			w[i] = reader.nextInt();
			v[i] = reader.nextInt();
		}

		for (int i = 1; i <= n; i++) {
			for (int j = m; j >= 0; j--) {
				if (j >= w[i - 1]) {
					dp[j] = Math.max(dp[j], dp[j - w[i - 1]] + v[i - 1]);
				}
			}
		}

		System.out.println(dp[m]);
		reader.close();
	}

}
