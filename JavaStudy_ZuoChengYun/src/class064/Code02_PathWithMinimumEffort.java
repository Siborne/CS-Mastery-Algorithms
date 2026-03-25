package class064;

import java.util.PriorityQueue;

public class Code02_PathWithMinimumEffort {

	private static int[] move = new int[] { -1, 0, 1, 0, -1 };

	public int minimumEffortPath(int[][] heights) {
		int n = heights.length;
		int m = heights[0].length;
		int[][] distance = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				distance[i][j] = Integer.MAX_VALUE;
			}
		}
		distance[0][0] = 0;
		boolean[][] visited = new boolean[n][m];
		PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[2] - b[2]);
		heap.add(new int[] { 0, 0, 0 });
		while (!heap.isEmpty()) {
			int[] record = heap.poll();
			int x = record[0];
			int y = record[1];
			int c = record[2];
			if (visited[x][y]) {
				continue;
			}
			if (x == n - 1 && y == m - 1) {
				return c;
			}
			visited[x][y] = true;
			for (int i = 0; i < 4; i++) {
				int nx = x + move[i];
				int ny = y + move[i + 1];
				if (nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny]) {
					int nc = Math.max(c, Math.abs(heights[x][y] - heights[nx][ny]));
					if (nc < distance[nx][ny]) {
						distance[nx][ny] = nc;
						heap.add(new int[] { nx, ny, nc });
					}
				}
			}
		}
		return -1;
	}

}
