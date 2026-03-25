package class038;

import java.util.HashSet;
import java.util.Set;

public class Code01_Subsequences {

	public String[] generatePermutation1(String str) {
		// write code here
		char[] s = str.toCharArray();
		Set<String> set = new HashSet<>();
		f1(s, 0, new StringBuilder(), set);
		int m = set.size();
		String[] ans = new String[m];
		int i = 0;
		for (String cur : set) {
			ans[i++] = cur;
		}
		return ans;
	}

	private static void f1(char[] s, int i, StringBuilder path, Set<String> set) {
		if (i == s.length) {
			set.add(path.toString());
		} else {
			path.append(s[i]);
			f1(s, i + 1, path, set);
			path.deleteCharAt(path.length() - 1);
			f1(s, i + 1, path, set);
		}
	}

	public static String[] generatePermutation2(String str) {
		char[] s = str.toCharArray();
		Set<String> set = new HashSet<>();
		f2(s, 0, new char[s.length], 0, set);
		int m = set.size();
		String[] ans = new String[m];
		int i = 0;
		for (String cur : set) {
			ans[i++] = cur;
		}
		return ans;
	}

	private static void f2(char[] s, int i, char[] path, int size, Set<String> set) {
		if (i == s.length) {
			set.add(String.valueOf(path, 0, size));
		} else {
			path[size] = s[i];
			f2(s, i + 1, path, size + 1, set);
			f2(s, i + 1, path, size, set);
		}
	}

}
