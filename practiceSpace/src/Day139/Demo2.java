package Day139;

public class Demo2 {

	public void moveZeroes(int[] nums) {
		int n = nums.length;
		for (int fast = 0, slow = 0; fast < n; fast++) {
			if (nums[fast] != 0) {
				swap(nums, fast, slow++);
			}
		}
	}

	private static void swap(int[] arr, int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

}
