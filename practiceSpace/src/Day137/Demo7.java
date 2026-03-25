package Day137;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo7 {

	private static long ans;
	private static String line;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		line = reader.nextLine();
		StringBuilder sb = new StringBuilder();

		for (char ch : line.toCharArray()) {
			if (ch == 'd') {
				solve(sb.toString());
				sb.setLength(0);
			} else {
				sb.append(ch);
			}
		}
		solve(sb.toString());

		System.out.println(ans);
		reader.close();
	}

	private static void solve(String s) {
		if (s.isEmpty()) {
			return;
		}
		Map<Character, Integer> map = new HashMap<>();
		ans += calc(s.length());

		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);

			while (map.getOrDefault('r', 0) > 0 && map.getOrDefault('e', 0) > 0) {
				char leftChar = s.charAt(j);
				map.put(leftChar, map.get(leftChar) - 1);
				j++;
			}
			ans -= (i - j + 1);
		}
	}

	private static long calc(long len) {
		return len * (len + 1) / 2;
	}

}
