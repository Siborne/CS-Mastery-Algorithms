package class058;

public class Code03_MakingLargeIsland {

	public int largestIsland(int[][] grid) {
		int n = grid.length;
		int m = grid[0].length;

		int id = 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (grid[i][j] == 1) {
					dfs(grid, n, m, i, j, id++);
				}
			}
		}

		int[] sizes = new int[id];
		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (grid[i][j] > 1) {
					ans = Math.max(ans, ++sizes[grid[i][j]]);
				}
			}
		}

		boolean[] visited = new boolean[id];
		int up, down, left, right, merge;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (grid[i][j] == 0) {
					up = i > 0 ? grid[i - 1][j] : 0;
					down = i + 1 < n ? grid[i + 1][j] : 0;
					left = j > 0 ? grid[i][j - 1] : 0;
					right = j + 1 < m ? grid[i][j + 1] : 0;
					visited[up] = true;
					merge = 1 + sizes[up];
					if (!visited[down]) {
						merge += sizes[down];
						visited[down] = true;
					}
					if (!visited[left]) {
						merge += sizes[left];
						visited[left] = true;
					}
					if (!visited[right]) {
						merge += sizes[right];
						visited[right] = true;
					}
					ans = Math.max(ans, merge);
					visited[up] = false;
					visited[down] = false;
					visited[left] = false;
					visited[right] = false;
				}
			}
		}

		return ans;
	}

	private static void dfs(int[][] grid, int n, int m, int i, int j, int id) {
		if (i < 0 || i == n || j < 0 || j == m || grid[i][j] != 1) {
			return;
		}
		grid[i][j] = id;
		dfs(grid, n, m, i - 1, j, id);
		dfs(grid, n, m, i + 1, j, id);
		dfs(grid, n, m, i, j - 1, id);
		dfs(grid, n, m, i, j + 1, id);
	}

}
