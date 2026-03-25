package Day127;

import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();

		int[] dp = new int[41];

		dp[0] = 0;
		dp[1] = 0;
		dp[2] = 1;
		dp[3] = 2;

		for (int i = 4; i < dp.length; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		while (n-- > 0) {
			int x = reader.nextInt();
			System.out.println(dp[x]);
		}

		reader.close();
	}

}
