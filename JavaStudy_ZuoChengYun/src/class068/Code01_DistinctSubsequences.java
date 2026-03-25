package class068;

public class Code01_DistinctSubsequences {

	public int numDistinct(String s, String t) {
		return numDistinct1(s, t);
	}

	private int numDistinct1(String str, String target) {
		char[] s = str.toCharArray();
		char[] t = target.toCharArray();

		int n = s.length;
		int m = t.length;

		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i <= n; i++) {
			dp[i][0] = 1;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				dp[i][j] = dp[i - 1][j];
				if (s[i - 1] == t[j - 1]) {
					dp[i][j] += dp[i - 1][j - 1];
				}
			}
		}
		return dp[n][m];
	}

	private int numDistinct2(String str, String target) {
		char[] s = str.toCharArray();
		char[] t = target.toCharArray();

		int n = s.length;
		int m = t.length;

		int[] dp = new int[m + 1];
		dp[0] = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = m; j >= 1; j--) {
				if (s[i - 1] == t[j - 1]) {
					dp[j] += dp[j - 1];
				}
			}
		}
		return dp[m];
	}

	private static final int MOD = (int) 1e9 + 7;

	private int numDistinct3(String str, String target) {
		char[] s = str.toCharArray();
		char[] t = target.toCharArray();

		int n = s.length;
		int m = t.length;

		int[] dp = new int[m + 1];
		dp[0] = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = m; j >= 1; j--) {
				if (s[i - 1] == t[j - 1]) {
					dp[j] = (dp[j] + dp[j - 1]) % MOD;
				}
			}
		}
		return dp[m];
	}

}
