package class062;

import java.util.ArrayDeque;
import java.util.Deque;

public class Code04_MinimumCostToMakeAtLeastOneValidPath {

	public int minCost(int[][] grid) {
		int[][] move = new int[][] { {}, { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
		int m = grid.length;
		int n = grid[0].length;
		int[][] distance = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				distance[i][j] = Integer.MAX_VALUE;
			}
		}
		Deque<int[]> queue = new ArrayDeque<>();
		queue.addFirst(new int[] { 0, 0 });
		distance[0][0] = 0;
		while (!queue.isEmpty()) {
			int[] record = queue.pollFirst();
			int x = record[0];
			int y = record[1];
			if (x == m - 1 && y == n - 1) {
				return distance[x][y];
			}
			for (int i = 1; i <= 4; i++) {
				int nx = x + move[i][0];
				int ny = y + move[i][1];
				int weight = grid[x][y] != i ? 1 : 0;
				if (nx >= 0 && nx < m && ny >= 0 && ny < n && distance[x][y] + weight < distance[nx][ny]) {
					distance[nx][ny] = distance[x][y] + weight;
					if (weight == 0) {
						queue.offerFirst(new int[] { nx, ny });
					} else {
						queue.offerLast(new int[] { nx, ny });
					}
				}
			}
		}
		return -1;
	}

}
