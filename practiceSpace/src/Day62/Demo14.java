package Day62;

import java.util.Scanner;

public class Demo14 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		long[] dp = new long[100005];
		long[] num = new long[100005];
		int max = 0;
		for(int i = 0;i<n;i++) {
			int x = reader.nextInt();
			num[x]++;
			max = Math.max(max, x);
		}
		dp[1] = num[1];
		for(int i = 2;i<=max;i++) {
			dp[i] = Math.max(dp[i-2]+num[i]*i,dp[i-1]);
		}
		System.out.println(dp[max]);
		reader.close();
	}
	
}
