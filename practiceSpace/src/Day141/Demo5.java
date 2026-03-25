package Day141;

import java.util.Arrays;

public class Demo5 {

	public int largestPerimeter(int[] nums) {
		Arrays.sort(nums);
		for (int i = nums.length - 1; i >= 2; i--) {
			if (nums[i - 2] + nums[i - 1] > nums[i]) {
				return nums[i - 2] + nums[i - 1] + nums[i];
			}
		}
		return 0;
	}

}
