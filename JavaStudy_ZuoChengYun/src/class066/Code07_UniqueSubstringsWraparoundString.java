package class066;

public class Code07_UniqueSubstringsWraparoundString {

	public int findSubstringInWraproundString(String str) {
		int n = str.length();
		int[] s = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = str.charAt(i) - 'a';
		}
		int[] dp = new int[26];
		dp[s[0]] = 1;
		for (int i = 1, cur, pre, len = 1; i < n; i++) {
			cur = s[i];
			pre = s[i - 1];
			if ((pre == 25 && cur == 0) || pre + 1 == cur) {
				len++;
			} else {
				len = 1;
			}
			dp[cur] = Math.max(dp[cur], len);
		}
		int ans = 0;
		for (int i = 0; i < dp.length; i++) {
			ans += dp[i];
		}
		return ans;
	}

}
