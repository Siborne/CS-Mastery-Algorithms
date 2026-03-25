package Day132;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		long[] dp = new long[41];
		dp[1] = 3;
		dp[2] = 8;
		for (int i = 3; i < dp.length; i++) {
			dp[i] = (dp[i - 1] << 1) + (dp[i - 2] << 1);
		}

		while (reader.hasNextInt()) {
			int x = reader.nextInt();
			System.out.println(dp[x]);
		}

		reader.close();
	}

}
