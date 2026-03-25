package class048;

import java.util.Arrays;

public class Code05_StrongestForceField {

	public int fieldOfGreatestBlessing(int[][] forceField) {
		int n = forceField.length;
		long[] xs = new long[n << 1];
		long[] ys = new long[n << 1];
		for (int i = 0, k = 0, p = 0; i < n; i++) {
			long x = forceField[i][0];
			long y = forceField[i][1];
			long r = forceField[i][2];
			xs[k++] = (x << 1) - r;
			xs[k++] = (x << 1) + r;
			ys[p++] = (y << 1) - r;
			ys[p++] = (y << 1) + r;
		}
		int sizex = sort(xs);
		int sizey = sort(ys);
		int[][] diff = new int[sizex + 2][sizey + 2];
		for (int i = 0, a, b, c, d; i < n; i++) {
			long x = forceField[i][0];
			long y = forceField[i][1];
			long r = forceField[i][2];
			a = rank(xs, (x << 1) - r, sizex);
			b = rank(ys, (y << 1) - r, sizey);
			c = rank(xs, (x << 1) + r, sizex);
			d = rank(ys, (y << 1) + r, sizey);
			add(diff, a, b, c, d);
		}
		int ans = 0;
		for (int i = 1; i < diff.length; i++) {
			for (int j = 1; j < diff[0].length; j++) {
				diff[i][j] += diff[i - 1][j] + diff[i][j - 1] - diff[i - 1][j - 1];
				ans = Math.max(ans, diff[i][j]);
			}
		}
		return ans;
	}

	private static int sort(long[] nums) {
		Arrays.sort(nums);
		int size = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[size++] = nums[i];
			}
		}
		return size;
	}

	private static int rank(long[] nums, long v, int size) {
		int l = 0;
		int r = size - 1;
		int m, ans = 0;
		while (l <= r) {
			m = l + ((r - l) >> 1);
			if (nums[m] >= v) {
				ans = m;
				r = m - 1;
			} else {
				l = m + 1;
			}
		}
		return ans + 1;
	}

	private static void add(int[][] diff, int a, int b, int c, int d) {
		diff[a][b] += 1;
		diff[a][d + 1] -= 1;
		diff[c + 1][b] -= 1;
		diff[c + 1][d + 1] += 1;
	}

}
