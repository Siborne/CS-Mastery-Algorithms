package Day12;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int m = reader.nextInt();
		int[] arr = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = reader.nextInt();
		}
		int[][] dp = new int[n+1][m+1];
		for(int i = 0;i<=n;i++) {
			dp[i][0] = 1;
		}
		
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=m;j++) {
				for(int k = 0;k<=j&&k<=arr[i];k++) {
					dp[i][j]+=dp[i-1][j-k];
					dp[i][j]%=(int)1e6+7;
				}
			}
		}
		System.out.println(dp[n][m]);
		
		
		reader.close();
	}

}