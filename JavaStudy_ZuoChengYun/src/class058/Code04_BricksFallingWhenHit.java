package class058;

public class Code04_BricksFallingWhenHit {

	private static int[][] grid;
	private static int n, m;

	public int[] hitBricks(int[][] g, int[][] hits) {
		grid = g;
		n = g.length;
		m = g[0].length;
		int[] ans = new int[hits.length];
		if (n == 1) {
			return ans;
		}
		for (int[] hit : hits) {
			grid[hit[0]][hit[1]]--;
		}
		for (int j = 0; j < m; j++) {
			dfs(0, j);
		}

		for (int i = hits.length - 1, row, col; i >= 0; i--) {
			row = hits[i][0];
			col = hits[i][1];
			grid[row][col]++;
			if (worth(row, col)) {
				ans[i] = dfs(row, col) - 1;
			}
		}
		return ans;
	}

	private static int dfs(int i, int j) {
		if (i < 0 || i == n || j < 0 || j == m || grid[i][j] != 1) {
			return 0;
		}
		grid[i][j] = 2;
		return 1 + dfs(i - 1, j) + dfs(i + 1, j) + dfs(i, j - 1) + dfs(i, j + 1);
	}

	private static boolean worth(int i, int j) {
		return grid[i][j] == 1 && (i == 0 || (i > 0 && grid[i - 1][j] == 2) || (i < n - 1 && grid[i + 1][j] == 2)
				|| (j > 0 && grid[i][j - 1] == 2) || (j < m - 1 && grid[i][j + 1] == 2));
	}

}
