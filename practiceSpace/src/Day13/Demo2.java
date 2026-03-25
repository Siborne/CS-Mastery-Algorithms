package Day13;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		int m = reader.nextInt();
		int[] time = new int[m];
		int[] value = new int[m];
		for (int i = 0; i < m; i++) {
			time[i] = reader.nextInt();
			value[i] = reader.nextInt();
		}
		int[][] dp = new int[m+1][t+1];
		for(int i = 1;i<=m;i++) {
			for(int j = 1;j<=t;j++) {
				if(j>=time[i-1]) {
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-time[i-1]]+value[i-1]);
				}else {
					dp[i][j] = Math.max(dp[i][j], dp[i-1][j]);
				}
			}
		}
		System.out.println(dp[m][t]);
	}

}
