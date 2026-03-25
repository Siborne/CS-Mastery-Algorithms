package class049;

import java.util.Arrays;

public class Code06_SubarraysWithKDifferentIntegers {

	public int subarraysWithKDistinct(int[] nums, int k) {
		return numsOfMostKinds(nums, k) - numsOfMostKinds(nums, k - 1);
	}

	private static final int MAXN = 20001;

	private static final int[] cnts = new int[MAXN];

	private static int numsOfMostKinds(int[] arr, int k) {
		Arrays.fill(cnts, 1, arr.length + 1, 0);
		int ans = 0;
		for (int l = 0, r = 0, collect = 0; r < arr.length; r++) {
			if (++cnts[arr[r]] == 1) {
				collect++;
			}
			while (collect > k) {
				if (--cnts[arr[l++]] == 0) {
					collect--;
				}
			}
			ans += r - l + 1;
		}
		return ans;
	}

}
