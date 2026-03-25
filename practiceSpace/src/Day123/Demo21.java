package Day123;

import java.util.Scanner;

public class Demo21 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int[] dp = new int[56];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 3;
		dp[4] = 4;
		for (int i = 4; i < dp.length; i++) {
			dp[i] = dp[i - 1] + dp[i - 3];
		}
		while (reader.hasNextInt()) {
			int n = reader.nextInt();
			if (n==0) {
				break;
			}
			System.out.println(dp[n]);
		}

		reader.close();
	}

}
