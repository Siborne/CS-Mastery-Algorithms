package Day137;

public class Demo8 {

	public int maxSubArray(int[] nums) {
		int n = nums.length;
		int pre = 0;
		int ans = nums[0];

		for (int x : nums) {
			pre = Math.max(pre + x, x);
			ans = Math.max(ans, pre);
		}

		return ans;
	}

}
