package Day136;

import java.util.HashMap;

public class Demo3_2 {

	class Solution {
		public int subarraySum(int[] nums, int k) {
			int count = 0;
			int pre = 0;
			HashMap<Integer, Integer> map = new HashMap<>();
			map.put(0, 1);
			for (int i = 0; i < nums.length; i++) {
				pre += nums[i];
				count += map.getOrDefault(pre - k, 0);
				map.put(pre, map.getOrDefault(pre, 0) + 1);
			}
			return count;
		}
	}

}
