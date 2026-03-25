package Day133;

public class Demo4 {

	class Solution {
		public void moveZeroes(int[] nums) {
			for (int fast = 0, slow = 0; fast < nums.length; fast++) {
				if (nums[fast] != 0) {
					swap(nums, fast, slow);
					slow++;
				}
			}
		}

		private void swap(int[] arr, int i, int j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

	}

}
