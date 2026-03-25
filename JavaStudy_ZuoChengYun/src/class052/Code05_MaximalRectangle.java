package class052;

import java.util.Arrays;

public class Code05_MaximalRectangle {

	private static final int MAXN = 201;
	private static final int[] height = new int[MAXN];
	private static final int[] stack = new int[MAXN];
	private static int r;

	public int maximalRectangle(char[][] matrix) {
		int n = matrix.length;
		int m = matrix[0].length;
		Arrays.fill(height, 0, m, 0);
		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				height[j] = matrix[i][j] == '0' ? 0 : height[j] + 1;
			}
			ans = Math.max(ans, largestRectangleArea(m));
		}
		return ans;
	}

	public int largestRectangleArea(int m) {
		r = 0;
		int ans = 0, cur, left;
		for (int i = 0; i < m; i++) {
			while (r > 0 && height[stack[r - 1]] >= height[i]) {
				cur = stack[--r];
				left = r == 0 ? -1 : stack[r - 1];
				ans = Math.max(ans, height[cur] * (i - left - 1));
			}
			stack[r++] = i;
		}
		while (r > 0) {
			cur = stack[--r];
			left = r == 0 ? -1 : stack[r - 1];
			ans = Math.max(ans, height[cur] * (m - left - 1));
		}
		return ans;
	}

}
