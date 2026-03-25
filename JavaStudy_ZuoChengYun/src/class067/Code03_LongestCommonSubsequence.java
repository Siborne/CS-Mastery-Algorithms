package class067;

public class Code03_LongestCommonSubsequence {

	public int longestCommonSubsequence1(String text1, String text2) {
		char[] s1 = text1.toCharArray();
		char[] s2 = text2.toCharArray();
		int n = s1.length;
		int m = s2.length;
		return f1(s1, s2, n - 1, m - 1);
	}

	private static int f1(char[] s1, char[] s2, int i1, int i2) {
		if (i1 < 0 || i2 < 0) {
			return 0;
		}
		int p1 = f1(s1, s2, i1 - 1, i2 - 1);
		int p2 = f1(s1, s2, i1 - 1, i2);
		int p3 = f1(s1, s2, i1, i2 - 1);
		int p4 = s1[i1] == s2[i2] ? (p1 + 1) : 0;
		return Math.max(Math.max(p1, p2), Math.max(p3, p4));
	}

	public int longestCommonSubsequence2(String text1, String text2) {
		char[] s1 = text1.toCharArray();
		char[] s2 = text2.toCharArray();
		int n = s1.length;
		int m = s2.length;
		return f2(s1, s2, n, m);
	}

	private static int f2(char[] s1, char[] s2, int len1, int len2) {
		if (len1 == 0 || len2 == 0) {
			return 0;
		}
		int ans;
		if (s1[len1 - 1] == s2[len2 - 1]) {
			ans = f2(s1, s2, len1 - 1, len2 - 1) + 1;
		} else {
			ans = Math.max(f2(s1, s2, len1 - 1, len2), f2(s1, s2, len1, len2 - 1));
		}
		return ans;
	}

	public int longestCommonSubsequence3(String text1, String text2) {
		char[] s1 = text1.toCharArray();
		char[] s2 = text2.toCharArray();
		int n = s1.length;
		int m = s2.length;
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				dp[i][j] = -1;
			}
		}
		return f3(s1, s2, n, m, dp);
	}

	private static int f3(char[] s1, char[] s2, int len1, int len2, int[][] dp) {
		if (len1 == 0 || len2 == 0) {
			return 0;
		}
		if (dp[len1][len2] != -1) {
			return dp[len1][len2];
		}
		int ans;
		if (s1[len1 - 1] == s2[len2 - 1]) {
			ans = f3(s1, s2, len1 - 1, len2 - 1,dp) + 1;
		} else {
			ans = Math.max(f3(s1, s2, len1 - 1, len2,dp), f3(s1, s2, len1, len2 - 1,dp));
		}
		dp[len1][len2] = ans;
		return ans;
	}

	public int longestCommonSubsequence4(String text1, String text2) {
		char[] s1 = text1.toCharArray();
		char[] s2 = text2.toCharArray();
		int n = s1.length;
		int m = s2.length;
		int[][] dp = new int[n + 1][m + 1];
		for (int len1 = 1; len1 <= n; len1++) {
			for (int len2 = 1; len2 <= m; len2++) {
				if (s1[len1 - 1] == s2[len2 - 1]) {
					dp[len1][len2] = dp[len1 - 1][len2 - 1] + 1;
				} else {
					dp[len1][len2] = Math.max(dp[len1 - 1][len2], dp[len1][len2 - 1]);
				}
			}
		}
		return dp[n][m];
	}

	public int longestCommonSubsequence5(String text1, String text2) {
		char[] s1, s2;
		if (text1.length() > text2.length()) {
			s1 = text1.toCharArray();
			s2 = text2.toCharArray();
		} else {
			s1 = text2.toCharArray();
			s2 = text1.toCharArray();
		}
		int n = s1.length;
		int m = s2.length;
		int[] dp = new int[m + 1];
		for (int len1 = 1; len1 <= n; len1++) {
			int leftUp = 0;
			int backup;
			for (int len2 = 1; len2 <= m; len2++) {
				backup = dp[len2];
				if (s1[len1 - 1] == s2[len2 - 1]) {
					dp[len2] = 1 + leftUp;
				} else {
					dp[len2] = Math.max(dp[len2], dp[len2 - 1]);
				}
				leftUp = backup;
			}
		}
		return dp[m];
	}

}
