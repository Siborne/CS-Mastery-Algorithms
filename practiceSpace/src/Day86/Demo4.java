package Day86;

import java.util.HashMap;
import java.util.Map;

public class Demo4 {

	public static void main(String[] args) {

	}

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				return new int[] { map.get(target - nums[i]), i };
			}
			map.put(nums[i], i);
		}

//		for (int i = 0; i < nums.length; i++) {
//			for (int j = 1; j < nums.length; j++) {
//				if (nums[i] + nums[j] == target) {
//					return new int[] { i, j };
//				}
//			}
//		}

		return null;
	}

}
