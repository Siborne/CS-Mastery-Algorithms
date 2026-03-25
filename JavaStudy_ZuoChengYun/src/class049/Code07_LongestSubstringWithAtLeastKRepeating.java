package class049;

import java.util.Arrays;

public class Code07_LongestSubstringWithAtLeastKRepeating {
	public int longestSubstring(String str, int k) {
		char[] s = str.toCharArray();
		int n = s.length;
		int[] cnts = new int[256];
		int ans = 0;
		for (int require = 1; require <= 26; require++) {
			Arrays.fill(cnts, 0);
			for (int l = 0, r = 0, collect = 0, satisfy = 0; r < n; r++) {
				cnts[s[r]]++;
				if (cnts[s[r]] == 1) {
					collect++;
				}
				if (cnts[s[r]] == k) {
					satisfy++;
				}
				while (collect > require) {
					if (cnts[s[l]] == 1) {
						collect--;
					}
					if (cnts[s[l]] == k) {
						satisfy--;
					}
					cnts[s[l++]]--;
				}
				if (satisfy == require) {
					ans = Math.max(ans, r - l + 1);
				}
			}
		}
		return ans;
	}
}
