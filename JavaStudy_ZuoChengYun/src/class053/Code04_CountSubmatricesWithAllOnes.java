package class053;

import java.util.Arrays;

public class Code04_CountSubmatricesWithAllOnes {

	private static final int MAXN = 151;
	private static final int[] height = new int[MAXN];
	private static final int[] stack = new int[MAXN];

	private static int r;

	public int numSubmat(int[][] mat) {
		int n = mat.length;
		int m = mat[0].length;
		int ans = 0;
		Arrays.fill(height, 0, m, 0);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				height[j] = mat[i][j] == 0 ? 0 : height[j] + 1;
			}
			ans += countFromBottom(m);
		}
		return ans;
	}

	private static int countFromBottom(int m) {
		r = 0;
		int ans = 0;
		for (int i = 0, left, len, bottom; i < m; i++) {
			while (r > 0 && height[stack[r - 1]] >= height[i]) {
				int cur = stack[--r];
				if (height[cur] > height[i]) {
					left = r == 0 ? -1 : stack[r - 1];
					len = i - left - 1;
					bottom = Math.max(left == -1 ? 0 : height[left], height[i]);
					ans += (height[cur] - bottom) * len * (len + 1) / 2;
				}
			}
			stack[r++] = i;
		}
		while (r > 0) {
			int cur = stack[--r];
			int left = r == 0 ? -1 : stack[r - 1];
			int len = m - left - 1;
			int down = left == -1 ? 0 : height[left];
			ans += (height[cur] - down) * len * (len + 1) / 2;
		}
		return ans;
	}

}
