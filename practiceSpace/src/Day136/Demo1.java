package Day136;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {

	class Solution {

		private Map<Character, Integer> map = new HashMap<Character, Integer>() {
			{
				put('I', 1);
				put('V', 5);
				put('X', 10);
				put('L', 50);
				put('C', 100);
				put('D', 500);
				put('M', 1000);
			}
		};

		public int romanToInt(String s) {
			int ans = 0;
			char[] chs = s.toCharArray();
			for (int i = 0; i < chs.length; i++) {
				int value = map.get(chs[i]);
				if (i < chs.length - 1 && value < map.get(chs[i + 1])) {
					ans -= value;
				} else {
					ans += value;
				}
			}
			return ans;
		}
	}
	
}
