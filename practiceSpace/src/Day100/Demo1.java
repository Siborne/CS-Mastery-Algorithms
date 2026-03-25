package Day100;

public class Demo1 {

	class Solution {
		public int removeElement(int[] nums, int val) {
			int l = 0;
			int r = nums.length - 1;
			while (l <= r) {
				if (nums[l] != val) {
					l++;
				} else {
					swap(nums, l, r);
					r--;
				}
			}

			return l;
		}

		private void swap(int[] nums, int i, int j) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}
	}

}
