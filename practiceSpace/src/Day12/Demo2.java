package Day12;

import java.util.Scanner;

public class Demo2 {
	public static long mod = (long)1e9+7;
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		long[] dp = new long[n+1];
		int m = reader.nextInt();
		while(m-->0) {
			int x = reader.nextInt();
			dp[x] = -1;
		}
		dp[0]=1;
		for(int i = 1;i<=n;i++) {
			if(dp[i]==-1) {
				continue;
			}
			if(i>=1&&dp[i-1]!=-1) {
				dp[i]+=dp[i-1]%mod;
			}
			if(i>=2&&dp[i-2]!=-1) {
				dp[i]+=dp[i-2]%mod;
			}
			dp[i]%=mod;
		}
		if(dp[n]==-1) {
			System.out.println("0");
		}else {
			System.out.println(dp[n]);
		}
	}

}
