package Day100;

public class Demo3 {
	class Solution {
		public int minSubArrayLen(int target, int[] nums) {
			int slow = 0;
			int sum = 0;
			int subListLength = 0;
			int ans = Integer.MAX_VALUE;
			for (int fast = 0; fast < nums.length; fast++) {
				sum += nums[fast];
				while (sum >= target) {
					subListLength = fast - slow + 1;
					ans = subListLength < ans ? subListLength : ans;
					sum -= nums[slow++];
				}
			}
			return ans == Integer.MAX_VALUE ? 0 : ans;
		}
	}
}
