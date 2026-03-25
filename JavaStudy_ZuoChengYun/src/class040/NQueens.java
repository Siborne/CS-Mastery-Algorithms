package class040;

public class NQueens {

	public int totalNQueens1(int n) {
		if (n < 1) {
			return 0;
		}
		return f1(0, new int[n], n);
	}

	private static int f1(int i, int[] path, int n) {
		if (i == n) {
			return 1;
		}
		int ans = 0;
		for (int j = 0; j < n; j++) {
			if (check(path, i, j)) {
				path[i] = j;
				ans += f1(i + 1, path, n);
			}
		}
		return ans;
	}

	private static boolean check(int[] path, int i, int j) {
		for (int k = 0; k < i; k++) {
			if (j == path[k] || Math.abs(i - k) == Math.abs(j - path[k])) {
				return false;
			}
		}
		return true;
	}

	public int totalNQueens2(int n) {
		if (n < 1) {
			return 0;
		}
		int limit = (1 << n) - 1;
		return f2(limit, 0, 0, 0);
	}

	private int f2(int limit, int col, int left, int right) {
		if (col == limit) {
			return 1;
		}
		int ban = col | left | right;
		int candidate = limit & (~ban);
		int place = 0;
		int ans = 0;
		while (candidate != 0) {
			place = candidate & (-candidate);
			candidate ^= place;
			ans += f2(limit, col | place, (left | place) >> 1, (right | place) << 1);
		}
		return ans;
	}
}
