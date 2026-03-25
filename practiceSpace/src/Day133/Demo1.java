package Day133;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int x = nums[i];
			if (map.containsKey(target - x)) {
				int value = map.get(target - x);
				int[] arr = new int[] { i, value };
				return arr;
			}
			map.put(x, i);
		}
		return null;

	}

}
