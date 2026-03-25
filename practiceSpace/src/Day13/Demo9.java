package Day13;

import java.util.Scanner;

public class Demo9 {
	public static int MOD = (int) 1e9 + 7;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int k = reader.nextInt();
		int[] dp = new int[n+1];
		dp[0] = 1;
		for(int i = 1;i<=n;i++) {
			if(i-k-1>=0) {
				dp[i] = (dp[i-1]+dp[i-1-k])%MOD;
			}else {
				dp[i] = (dp[i-1]+1)%MOD;
			}
		}
		System.out.println(dp[n]);
		reader.close();
	}

}
