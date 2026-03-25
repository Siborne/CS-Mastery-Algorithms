package Day41;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[][] triangle = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				triangle[i][j] = reader.nextInt();
			}
		}
		int[][] dp = new int[n][n];
		dp[0][0] = triangle[0][0];
		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				int left = (j > 0) ? dp[i - 1][j - 1] : Integer.MIN_VALUE;
				int right = (j < i) ? dp[i - 1][j] : Integer.MIN_VALUE;
				dp[i][j] = triangle[i][j] + Math.max(left, right);
			}
		}
		
		int maxSum;
		if((n&1)==1) {
			int mid = (n-1)>>1;
			maxSum = dp[n-1][mid];
		}else {
			int mid1 = n>>1;
			int mid2 = mid1-1;
			maxSum=Math.max(dp[n-1][mid1], dp[n-1][mid2]);
		}
		
		System.out.println(maxSum);
		
		reader.close();
	}

}
