package class068;

public class Code02_EditDistance {

	public int minDistance(String word1, String word2) {
		return minDistance1(word1, word2, 1, 1, 1);
	}

	public int minDistance1(String word1, String word2, int a, int b, int c) {
		char[] s1 = word1.toCharArray();
		char[] s2 = word2.toCharArray();

		int n = s1.length;
		int m = s2.length;

		int[][] dp = new int[n + 1][m + 1];
		for (int i = 1; i <= n; i++) {
			dp[i][0] = i * b;
		}
		for (int j = 1; j <= m; j++) {
			dp[0][j] = j * a;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				int p1 = Integer.MAX_VALUE;
				if (s1[i - 1] == s2[j - 1]) {
					p1 = dp[i - 1][j - 1];
				}
				int p2 = Integer.MAX_VALUE;
				if (s1[i - 1] != s2[j - 1]) {
					p2 = dp[i - 1][j - 1] + c;
				}
				int p3 = dp[i][j - 1] + a;
				int p4 = dp[i - 1][j] + b;
				dp[i][j] = Math.min(Math.min(p1, p2), Math.min(p3, p4));
			}
		}

		return dp[n][m];
	}

	public int minDistance2(String word1, String word2, int a, int b, int c) {
		char[] s1 = word1.toCharArray();
		char[] s2 = word2.toCharArray();

		int n = s1.length;
		int m = s2.length;

		int[][] dp = new int[n + 1][m + 1];
		for (int i = 1; i <= n; i++) {
			dp[i][0] = i * b;
		}
		for (int j = 1; j <= m; j++) {
			dp[0][j] = j * a;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (s1[i - 1] == s2[j - 1]) {
					dp[i][j] = dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.min(Math.min(dp[i - 1][j] + b, dp[i][j - 1] + a), dp[i - 1][j - 1] + c);
				}
			}
		}

		return dp[n][m];
	}

	public int minDistance3(String word1, String word2, int a, int b, int c) {
		char[] s1 = word1.toCharArray();
		char[] s2 = word2.toCharArray();

		int n = s1.length;
		int m = s2.length;

		int[] dp = new int[m + 1];

		for (int j = 1; j <= m; j++) {
			dp[j] = j * a;
		}

		for (int i = 1, leftUp, backUp; i <= n; i++) {
			leftUp = (i - 1) * b;
			dp[0] = i * b;
			for (int j = 1; j <= m; j++) {
				backUp = dp[j];
				if (s1[i - 1] == s2[j - 1]) {
					dp[j] = leftUp;
				} else {
					dp[j] = Math.min(Math.min(dp[j] + b, dp[j - 1] + a), leftUp + c);
				}
				leftUp = backUp;
			}
		}

		return dp[m];
	}
}
