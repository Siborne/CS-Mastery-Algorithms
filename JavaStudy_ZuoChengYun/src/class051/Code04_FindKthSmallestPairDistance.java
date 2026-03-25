package class051;

import java.util.Arrays;

public class Code04_FindKthSmallestPairDistance {

	public int smallestDistancePair(int[] nums, int k) {
		int n = nums.length;
		Arrays.sort(nums);
		int ans = 0;
		for (int l = 0, r = nums[n - 1] - nums[0], m, cnt; l <= r;) {
			m = l + ((r - l) >> 1);
			cnt = f(nums, m);
			if (cnt >= k) {
				ans = m;
				r = m - 1;
			} else {
				l = m + 1;
			}
		}

		return ans;
	}

	private static int f(int[] arr, int limit) {
		int ans = 0;
		for (int l = 0, r = 0; l < arr.length; l++) {
			while (r + 1 < arr.length && arr[r + 1] - arr[l] <= limit) {
				r++;
			}
			ans += r - l;
		}
		return ans;
	}

}
