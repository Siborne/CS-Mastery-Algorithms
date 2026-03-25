package class051;

public class Code02_SplitArrayLargestSum {

	public int splitArray(int[] nums, int k) {
		long sum = 0;
		for (int num : nums) {
			sum += num;
		}
		long ans = 0;

		for (long l = 0, r = sum, m, need; l <= r;) {
			m = l + ((r - l) >> 1);
			need = f(nums, m);
			if (need <= k) {
				ans = m;
				r = m - 1;
			} else {
				l = m + 1;
			}
		}

		return (int) ans;
	}

	private static int f(int[] arr, long limit) {
		int parts = 1;
		int sum = 0;
		for (int num : arr) {
			if (num > limit) {
				return Integer.MAX_VALUE;
			}
			if (sum + num > limit) {
				parts++;
				sum = num;
			} else {
				sum += num;
			}
		}
		return parts;
	}

}
