package Day130;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int[] dp = new int[n + 1];
		dp[0] = 1;
		for (int i = 1; i <= n; i++) {
			dp[i] = 0;
			for (int j = 0; j < i; j++) {
				dp[i] = (dp[i] + dp[j] * dp[i - 1 - j]) % 100;
			}
		}
		System.out.println(dp[n]);

		reader.close();
	}

}
