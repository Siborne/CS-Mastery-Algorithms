package Day135;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo3 {

	class Solution {
		public List<Integer> findAnagrams(String s, String p) {
			List<Integer> res = new ArrayList<>();
			int sLen = s.length();
			int pLen = p.length();
			if (s.length() < p.length()) {
				return res;
			}

			int[] sCount = new int[26];
			int[] pCount = new int[26];
			for (int i = 0; i < sLen; i++) {
				sCount[s.charAt(i) - 'a']++;
				pCount[p.charAt(i) - 'a']++;
			}

			if (Arrays.equals(sCount, pCount)) {
				res.add(0);
			}

			for (int i = 0; i < sLen - pLen; i++) {
				sCount[s.charAt(i) - 'a']--;
				sCount[s.charAt(i + pLen) - 'a']++;

				if (Arrays.equals(sCount, pCount)) {
					res.add(i + 1);
				}
			}

			return res;
		}
	}

}
