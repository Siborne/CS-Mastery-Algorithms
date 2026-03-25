package class053;

public class Code01_MaximumWidthRamp {

	private static final int MAXN = 50001;
	private static int[] stack = new int[MAXN];
	private static int r;

	public int maxWidthRamp(int[] nums) {
		r = 1;
		int n = nums.length;
		for (int i = 1; i < n; i++) {
			if (nums[stack[r - 1]] > nums[i]) {
				stack[r++] = i;
			}
		}
		int ans = 0;
		for (int i = n - 1; i >= 0; i--) {
			while (r > 0 && nums[stack[r - 1]] <= nums[i]) {
				ans = Math.max(ans, i - stack[--r]);
			}
		}
		return ans;
	}

}
