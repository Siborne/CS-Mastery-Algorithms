package class049;

public class Code01_MinimumSizeSubarraySum {
	public int minSubArrayLen(int target, int[] nums) {
		int ans = Integer.MAX_VALUE;
		for (int r = 0, l = 0, sum = 0; r < nums.length; r++) {
			sum += nums[r];
			while (sum - nums[l] >= target) {
				sum -= nums[l++];
			}
			if (sum >= target) {
				ans = Math.min(ans, r - l + 1);
			}
		}

		return ans == Integer.MAX_VALUE ? 0 : ans;
	}
}
