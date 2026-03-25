package class062;

import java.util.PriorityQueue;

public class Code05_TrappingRainWaterII {

	public int trapRainWater(int[][] heightMap) {
		int[] move = new int[] { -1, 0, 1, 0, -1 };
		int n = heightMap.length;
		int m = heightMap[0].length;

		PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[2] - b[2]);
		boolean[][] visited = new boolean[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
					heap.add(new int[] { i, j, heightMap[i][j] });
					visited[i][j] = true;
				} else {
					visited[i][j] = false;
				}
			}
		}
		int ans = 0;
		while (!heap.isEmpty()) {
			int[] record = heap.poll();
			int r = record[0];
			int c = record[1];
			int w = record[2];
			ans += w - heightMap[r][c];
			for (int i = 0, nr, nc; i < 4; i++) {
				nr = r + move[i];
				nc = c + move[i + 1];
				if (nr >= 0 && nr < n && nc >= 0 && nc < m && !visited[nr][nc]) {
					heap.add(new int[] { nr, nc, Math.max(heightMap[nr][nc], w) });
					visited[nr][nc] = true;
				}
			}
		}
		return ans;
	}

}
