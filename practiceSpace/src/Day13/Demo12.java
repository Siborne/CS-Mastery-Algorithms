package Day13;

import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int x = reader.nextInt();
		long base = 0;
		int[] validWin = new int[n];
		int[] validUse = new int[n];
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			int lose = reader.nextInt();
			int win = reader.nextInt();
			int use = reader.nextInt();
			base += lose;

			int extra = win - lose;
			if (extra > 0) {
				validUse[cnt] = use;
				validWin[cnt] = extra;
				cnt++;
			}
		}

		int[] dp = new int[x + 1];
		for (int i = 0; i < cnt; i++) {
			for (int j = x; j >=validUse[i] ; j--) {
				dp[j] = Math.max(dp[j], dp[j-validUse[i]]+validWin[i]);
			}
		}
		int maxExtra = 0;
		for(int i = 0;i<=x;i++) {
			maxExtra = Math.max(maxExtra, dp[i]);
		}

		System.out.println((base + maxExtra) * 5);

		reader.close();
	}

}
