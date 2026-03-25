package Day100;

public class Demo2 {

	class Solution {
		public int[] sortedSquares(int[] nums) {
			int l = 0;
			int r = nums.length - 1;
			int[] res = new int[nums.length];
			for (int k = r; k >= 0; k--) {
				if (nums[l] * nums[l] > nums[r] * nums[r]) {
					res[k] = nums[l]*nums[l];
					l++;
				}else {
					res[k] = nums[r]*nums[r];
					r--;
				}
			}
			return res;
		}
	}

}
