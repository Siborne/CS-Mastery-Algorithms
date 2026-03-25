package Day135;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo3_2 {
	class Solution {
		public List<Integer> findAnagrams(String s, String p) {
			List<Integer> ans = new ArrayList<>();
			int sLen = s.length();
			int pLen = p.length();
			if (sLen < pLen) {
				return ans;
			}

			int[] count = new int[26];
			for (int i = 0; i < pLen; i++) {
				count[s.charAt(i) - 'a']++;
				count[p.charAt(i) - 'a']--;
			}
			int differ = 0;
			for (int i = 0; i < count.length; i++) {
				if (count[i] != 0) {
					differ++;
				}
			}

			if (differ == 0) {
				ans.add(0);
			}

			for (int i = 0; i < sLen - pLen; i++) {
				if (count[s.charAt(i) - 'a'] == 1) {
					differ--;
				} else if (count[s.charAt(i) - 'a'] == 0) {
					differ++;
				}
				count[s.charAt(i) - 'a']--;

				if (count[s.charAt(i + pLen) - 'a'] == -1) {
					differ--;
				} else if (count[s.charAt(i + pLen) - 'a'] == 0) {
					differ++;
				}
				count[s.charAt(i + pLen) - 'a']++;

				if (differ == 0) {
					ans.add(i + 1);
				}
			}

			return ans;
		}
	}
}
