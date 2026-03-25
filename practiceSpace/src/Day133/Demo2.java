package Day133;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo2 {

	class Solution {
		public List<List<String>> groupAnagrams(String[] strs) {
			Map<String, List<String>> map = new HashMap<>();
			List<List<String>> res = new ArrayList<>();
			for (String string : strs) {
				char[] chs = string.toCharArray();
				Arrays.sort(chs);
				String str = String.valueOf(chs);
				if (map.containsKey(str)) {
					List<String> list = map.get(str);
					list.add(string);
				} else {
					List<String> list = new ArrayList<>();
					list.add(string);
					map.put(str, list);
					res.add(list);
				}
			}

			return res;
		}
	}

}
