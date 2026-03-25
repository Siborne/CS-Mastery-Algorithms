package class046;

import java.util.HashMap;
import java.util.Map;

public class Code06_MakeSumDivisibleByP {

	public int minSubarray(int[] nums, int p) {
		int mod = 0;
		for (int num : nums) {
			mod = (mod + num) % p;
		}
		if (mod == 0) {
			return 0;
		}

		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int ans = Integer.MAX_VALUE;
		for (int i = 0, cur = 0, find; i < nums.length; i++) {
			cur = (cur + nums[i]) % p;
			find = (cur - mod + p) % p;
			if (map.containsKey(find)) {
				ans  = Math.min(ans, i-map.get(find));
			}
			map.put(cur, i);
		}
		return ans == nums.length ? -1 : ans;
	}

}
