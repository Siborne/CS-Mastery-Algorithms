package class063;

import java.util.Arrays;

public class Code03_ClosestSubsequenceSum {

	private static int MAXN = 1 << 20;
	private static int[] lsum = new int[MAXN];
	private static int[] rsum = new int[MAXN];

	private static int fill;

	public int minAbsDifference(int[] nums, int goal) {
		int n = nums.length;
		long min = 0;
		long max = 0;
		for (int i = 0; i < n; i++) {
			if (nums[i] >= 0) {
				max += nums[i];
			} else {
				min += nums[i];
			}
		}
		if (max < goal) {
			return (int) Math.abs(max - goal);
		}
		if (min > goal) {
			return (int) Math.abs(min - goal);
		}
		Arrays.sort(nums);
		fill = 0;
		collect(nums, 0, n >> 1, 0, lsum);
		int lsize = fill;
		fill = 0;
		collect(nums, n >> 1, n, 0, rsum);
		int rsize = fill;
		Arrays.sort(lsum, 0, lsize);
		Arrays.sort(rsum, 0, rsize);
		int ans = Math.abs(goal);
		for (int i = 0, j = rsize - 1; i < lsize; i++) {
			while (j > 0 && Math.abs(goal - lsum[i] - rsum[j - 1]) <= Math.abs(goal - lsum[i] - rsum[j])) {
				j--;
			}
			ans = Math.min(ans, Math.abs(goal - lsum[i] - rsum[j]));
		}
		return ans;
	}

	private static void collect(int[] nums, int i, int e, int s, int[] sum) {
		if (i == e) {
			sum[fill++] = s;
		} else {
			int j = i + 1;
			while (j < e && nums[j] == nums[i]) {
				j++;
			}
			for (int k = 0; k <= j - i; k++) {
				collect(nums, j, e, s + k * nums[i], sum);
			}
		}
	}

}
