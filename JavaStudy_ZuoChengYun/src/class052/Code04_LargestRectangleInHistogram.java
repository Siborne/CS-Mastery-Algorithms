package class052;

public class Code04_LargestRectangleInHistogram {

	private static final int MAXN = 100001;
	private static final int[] stack = new int[MAXN];
	private static int r;

	public int largestRectangleArea(int[] heights) {
		int n = heights.length;
		r = 0;
		int ans = 0, cur, left;
		for (int i = 0; i < n; i++) {
			while (r > 0 && heights[stack[r - 1]] >= heights[i]) {
				cur = stack[--r];
				left = r == 0 ? -1 : stack[r - 1];
				ans = Math.max(ans, heights[cur] * (i - left - 1));
			}
			stack[r++] = i;
		}
		while (r > 0) {
			cur = stack[--r];
			left = r == 0 ? -1 : stack[r - 1];
			ans = Math.max(ans, heights[cur] * (n - left - 1));
		}
		return ans;
	}
}
