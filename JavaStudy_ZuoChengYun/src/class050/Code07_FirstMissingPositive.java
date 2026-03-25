package class050;

public class Code07_FirstMissingPositive {

	public int firstMissingPositive(int[] nums) {
		int l = 0;
		int r = nums.length;
		while (l < r) {
			if (nums[l] == l + 1) {
				l++;
			} else if (nums[l] <= l || nums[l] > r || nums[nums[l] - 1] == nums[l]) {
				swap(nums, l, --r);
			} else {
				swap(nums, l, nums[l] - 1);
			}
		}

		return l + 1;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
