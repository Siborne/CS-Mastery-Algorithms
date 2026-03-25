package class066;

public class Code06_LongestValidParentheses {
	public int longestValidParentheses(String str) {
		char[] s = str.toCharArray();
		int[] dp = new int[s.length];
		int ans = 0;
		for (int i = 1, p; i < s.length; i++) {
			if (s[i] == ')') {
				p = i - dp[i - 1] - 1;
				if (p >= 0 && s[p] == '(') {
					dp[i] = dp[i - 1] + 2 + (p - 1 >= 0 ? dp[p - 1] : 0);
				}
			}
			ans = Math.max(ans, dp[i]);
		}
		return ans;
	}
}
