package Day12;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
		}
		int[] dp = new int[n];
		int max = 1;
		dp[0] = 1;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				} else {
					dp[i] = Math.max(dp[i], 1);
				}
			}
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
	}

}
