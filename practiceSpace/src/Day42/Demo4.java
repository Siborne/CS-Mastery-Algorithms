package Day42;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] arr = new int[n];

		int gcd = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
			if (i == 0) {
				gcd = arr[i];
			} else {
				gcd = gcd(gcd, arr[i]);
			}
		}

		if (gcd > 1) {
			System.out.println("INF");
		} else {
			int x = (int) 1e5;
			boolean[] dp = new boolean[x + 1];
			dp[0] = true;
			for(int i = 0;i<n;i++) {
				for(int j = arr[i];j<=x;j++) {
					if (dp[j-arr[i]]==true){
	                    dp[j]=true;
	                }
				}
			}
			
			long ans = 0L;
			for(int i = 1;i<=x;i++) {
				if(!dp[i]) {
					ans++;
				}
			}
			
			System.out.println(ans);
		}

		reader.close();
	}

	private static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

}
