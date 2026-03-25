package Day133;

import java.util.HashSet;
import java.util.Set;

public class Demo3 {

	class Solution {
		public int longestConsecutive(int[] nums) {
			if (nums == null || nums.length == 0) {
				return 0;
			}
			Set<Integer> set = new HashSet<>();

			for (int num : nums) {
				set.add(num);
			}

			int res = 0;
			for (int num : set) {
				if (!set.contains(num - 1)) {
					int currentNum = num;
					int currentLength = 1;
					while (set.contains(currentNum + 1)) {
						currentNum++;
						currentLength++;
					}
					res = Math.max(res, currentLength);
				}
			}

			return res;
		}
	}

}
