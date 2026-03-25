package Day139;

import java.util.HashMap;
import java.util.Map;

public class Demo3 {

	private static Map<Character, Integer> map = new HashMap<>();

	static {
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
	}

	public int romanToInt(String s) {
		int len = s.length();
		int ans = 0;
		for (int i = 0; i < len; i++) {
			ans += map.get(s.charAt(i));
			if (i > 0 && map.get(s.charAt(i - 1)) < map.get(s.charAt(i))) {
				ans -= 2 * map.get(s.charAt(i - 1));
			}
		}
		return ans;
	}

}
