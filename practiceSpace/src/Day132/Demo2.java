package Day132;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		long[] dp = new long[51];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i < dp.length; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		while (reader.hasNextInt()) {
			int x = reader.nextInt();
			System.out.println(dp[x]);
		}

		reader.close();
	}

}
