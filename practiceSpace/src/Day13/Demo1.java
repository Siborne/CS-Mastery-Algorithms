package Day13;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int m = reader.nextInt();
		int[] w = new int[n];
		int[] v = new int[n];
		for(int i =0;i<n;i++) {
			w[i] = reader.nextInt();
			v[i] = reader.nextInt();
		}
		
		int[][] dp = new int[n+1][m+1];
		for(int i = 1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(j>=w[i-1]) {
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i-1]]+v[i-1]);
				}else {
					dp[i][j] = Math.max(dp[i][j], dp[i-1][j]);
				}
			}
		}
		System.out.println(dp[n][m]);
	}
	
}
