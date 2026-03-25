package Day12;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int m = reader.nextInt();
		int[][] dp = new int[m+1][n];
		dp[0][0]=1;
		for(int i = 1;i<=m;i++) {
			for(int j = 0;j<n;j++) {
				dp[i][j] = (dp[i-1][(j+1)%n]+dp[i-1][(j-1+n)%n]);
			}
		}
		System.out.println(dp[m][0]);
	}

}
