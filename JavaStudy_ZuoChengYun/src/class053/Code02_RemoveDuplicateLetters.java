package class053;

import java.util.Arrays;

public class Code02_RemoveDuplicateLetters {

	private static int MAXN = 26;
	private static int[] cnts = new int[MAXN];
	private static boolean[] enter = new boolean[MAXN];
	private static char[] stack = new char[MAXN];
	private static int r;

	public String removeDuplicateLetters(String s) {
		r = 0;
		Arrays.fill(cnts, 0);
		Arrays.fill(enter, false);
		char[] chs = s.toCharArray();
		for (char ch : chs) {
			cnts[ch - 'a']++;
		}
		for (char cur : chs) {
			if (!enter[cur - 'a']) {
				while (r > 0 && stack[r - 1] > cur && cnts[stack[r - 1] - 'a'] > 0) {
					enter[stack[r - 1] - 'a'] = false;
					r--;
				}
				stack[r++] = cur;
				enter[cur - 'a'] = true;
			}
			cnts[cur - 'a']--;
		}
		return String.valueOf(stack, 0, r);

	}

}
