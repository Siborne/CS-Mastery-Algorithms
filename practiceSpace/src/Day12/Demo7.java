package Day12;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[][] triangle = new int[n][n];
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<=i;j++) {
				triangle[i][j] = reader.nextInt();
			}
		}
		int[][] dp = new int[n][n];
		for(int i = 0;i<n;i++) {
			dp[n-1][i] = triangle[n-1][i];
		}
		for(int i = n-2;i>=0;i--) {
			for(int j = i;j>=0;j--) {
				dp[i][j] = Math.max(dp[i+1][j]+triangle[i][j], dp[i+1][j+1]+triangle[i][j]);
			}
		}
		System.out.println(dp[0][0]);
		reader.close();
	}

}
