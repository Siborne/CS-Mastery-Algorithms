package class062;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Code02_StickersToSpellWord {

	private static final int MAXN = 401;

	private static String[] queue = new String[MAXN];

	private static int l, r;

	private static List<List<String>> graph = new ArrayList<>();

	static {
		for (int i = 0; i < 26; i++) {
			graph.add(new ArrayList<>());
		}
	}

	private static Set<String> visited = new HashSet<>();

	public int minStickers(String[] stickers, String target) {
		for (int i = 0; i < 26; i++) {
			graph.get(i).clear();
		}
		visited.clear();
		for (String str : stickers) {
			str = sort(str);
			for (int i = 0; i < str.length(); i++) {
				if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
					graph.get(str.charAt(i) - 'a').add(str);
				}
			}
		}
		target = sort(target);
		visited.add(target);
		l = r = 0;
		queue[r++] = target;
		int level = 1;
		while (l < r) {
			int size = r - l;
			for (int i = 0; i < size; i++) {
				String cur = queue[l++];
				for (String s : graph.get(cur.charAt(0) - 'a')) {
					String next = next(cur, s);
					if (next.equals("")) {
						return level;
					} else if (!visited.contains(next)) {
						visited.add(next);
						queue[r++] = next;
					}
				}
			}
			level++;
		}
		return -1;
	}

	private static String sort(String str) {
		char[] s = str.toCharArray();
		Arrays.sort(s);
		return String.valueOf(s);
	}

	private static String next(String t, String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0, j = 0; i < t.length();) {
			if (j == s.length()) {
				sb.append(t.charAt(i++));
			} else {
				if (t.charAt(i) < s.charAt(j)) {
					sb.append(t.charAt(i++));
				} else if (t.charAt(i) > s.charAt(j)) {
					j++;
				} else {
					i++;
					j++;
				}
			}
		}
		return sb.toString();
	}

}
