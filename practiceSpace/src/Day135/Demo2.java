package Day135;

import java.util.Arrays;

public class Demo2 {

	class Solution {
		public int lengthOfLongestSubstring(String s) {
			char[] ch = s.toCharArray();
			int ans = 0;
			int[] last = new int[256];
			Arrays.fill(last, -1);
			for (int l = 0, r = 0; r < ch.length; r++) {
				l = Math.max(l, last[ch[r]] + 1);
				ans = Math.max(ans, r - l + 1);
				last[ch[r]] = r;
			}
			return ans;
		}
	}

}
