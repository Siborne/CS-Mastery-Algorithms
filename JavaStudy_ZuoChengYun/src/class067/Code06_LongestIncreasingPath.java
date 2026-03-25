package class067;

public class Code06_LongestIncreasingPath {

	public int longestIncreasingPath1(int[][] matrix) {
		int ans = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				ans = Math.max(ans, f1(matrix, i, j));
			}
		}
		return ans;
	}

	private static int f1(int[][] grid, int i, int j) {
		int next = 0;
		if (i > 0 && grid[i][j] < grid[i - 1][j]) {
			next = Math.max(next, f1(grid, i - 1, j));
		}
		if (i + 1 < grid.length && grid[i][j] < grid[i + 1][j]) {
			next = Math.max(next, f1(grid, i + 1, j));
		}
		if (j > 0 && grid[i][j] < grid[i][j - 1]) {
			next = Math.max(next, f1(grid, i, j - 1));
		}
		if (j + 1 < grid[0].length && grid[i][j] < grid[i][j + 1]) {
			next = Math.max(next, f1(grid, i, j + 1));
		}
		return next + 1;
	}

	public int longestIncreasingPath2(int[][] matrix) {
		int n = matrix.length;
		int m = matrix[0].length;
		int[][] dp = new int[n][m];
		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				ans = Math.max(ans, f2(matrix, i, j, dp));
			}
		}
		return ans;
	}

	private static int f2(int[][] grid, int i, int j, int[][] dp) {
		if (dp[i][j] != 0) {
			return dp[i][j];
		}
		int next = 0;
		if (i > 0 && grid[i][j] < grid[i - 1][j]) {
			next = Math.max(next, f2(grid, i - 1, j, dp));
		}
		if (i + 1 < grid.length && grid[i][j] < grid[i + 1][j]) {
			next = Math.max(next, f2(grid, i + 1, j, dp));
		}
		if (j > 0 && grid[i][j] < grid[i][j - 1]) {
			next = Math.max(next, f2(grid, i, j - 1, dp));
		}
		if (j + 1 < grid[0].length && grid[i][j] < grid[i][j + 1]) {
			next = Math.max(next, f2(grid, i, j + 1, dp));
		}
		dp[i][j] = next + 1;
		return next + 1;
	}

}
