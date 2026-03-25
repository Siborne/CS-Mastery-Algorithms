package Day139;

public class Demo6 {

	public int arraySign(int[] nums) {
		int sign = 1;
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			if (nums[i] == 0) {
				return 0;
			} else if (nums[i] < 0) {
				sign *= -1;
			}
		}
		return sign;
	}

}
