package Day74;

import java.util.Scanner;

public class Demo2 {

	private static final int MOD = 100003;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int k = reader.nextInt();
		int[] dp = new int[n + 1];
		dp[0] = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= k && i - j >= 0; j++) {
				dp[i] = (dp[i] + dp[i - j]) % MOD;
			}
		}

		System.out.println(dp[n]);
		reader.close();
	}

}
