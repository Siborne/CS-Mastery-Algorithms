package Day13;

import java.util.Arrays;
import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] arr = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			arr[i] = reader.nextInt();
		}
		int[] dp = new int[n + 1];
		Arrays.fill(dp, 1);
		int ans = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				if (arr[j] < arr[i]) {
					dp[i] = Math.max(dp[j] + 1, dp[i]);
				}
			}
			ans = Math.max(ans, dp[i]);
		}
		System.out.println(ans);
		
		Arrays.fill(dp, 1);
		ans = 1;
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<i;j++) {
				if(arr[j]>=arr[i]) {
					dp[i] = Math.max(dp[j]+1, dp[i]);
				}
			}
			ans=Math.max(ans, dp[i]);
		}
		System.out.println(ans);
		
		Arrays.fill(dp, 1);
		ans = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				if (arr[j] <= arr[i]) {
					dp[i] = Math.max(dp[j] + 1, dp[i]);
				}
			}
			ans = Math.max(ans, dp[i]);
		}
		System.out.println(ans);
		
		Arrays.fill(dp, 1);
		ans = 1;
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<i;j++) {
				if(arr[j]>arr[i]) {
					dp[i] = Math.max(dp[j]+1, dp[i]);
				}
			}
			ans=Math.max(ans, dp[i]);
		}
		System.out.println(ans);
		
		
		reader.close();
	}

}
