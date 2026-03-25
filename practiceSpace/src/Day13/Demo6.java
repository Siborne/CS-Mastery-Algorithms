package Day13;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int m = reader.nextInt();
		int[] dp = new int[m + 1];
		int[] w = new int[n];
		int[] v = new int[n];
		for (int i = 0; i < n; i++) {
			w[i] = reader.nextInt();
			v[i] = reader.nextInt();
		}
		
		for(int i = 1;i<=n;i++) {
			for(int j = w[i-1];j<=m;j++) {
				dp[j] = Math.max(dp[j], dp[j-w[i-1]]+v[i-1]);
			}
		}
		System.out.println(dp[m]);
	}

}
