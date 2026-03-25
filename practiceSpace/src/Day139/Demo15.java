package Day139;

public class Demo15 {

	public String minWindow(String str, String tar) {
		char[] s = str.toCharArray();
		char[] t = tar.toCharArray();
		int[] cnt = new int[256];
		for (int i : t) {
			cnt[i]--;
		}

		int len = Integer.MAX_VALUE;
		int start = 0;
		int diff = t.length;
		for (int l = 0, r = 0; r < s.length; r++) {
			if (cnt[s[r]]++ < 0) {
				diff--;
			}
			if (diff == 0) {
				while (cnt[s[l]] > 0) {
					cnt[s[l++]]--;
				}
				if (r - l + 1 < len) {
					start = l;
					len = r - l + 1;
				}
			}
		}
		return len == Integer.MAX_VALUE ? "" : str.substring(start, start + len);
	}

}
