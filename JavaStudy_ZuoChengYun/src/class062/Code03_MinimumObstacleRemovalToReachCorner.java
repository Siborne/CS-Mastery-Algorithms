package class062;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Code03_MinimumObstacleRemovalToReachCorner {

	private static int[] move = new int[] { -1, 0, 1, 0, -1 };

	public int minimumObstacles(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		int[][] distance = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				distance[i][j] = Integer.MAX_VALUE;
			}
		}
		Deque<int[]> deque = new ArrayDeque<>();
		deque.addFirst(new int[] { 0, 0 });
		distance[0][0] = 0;
		while (!deque.isEmpty()) {
			int[] record = deque.pollFirst();
			int x = record[0];
			int y = record[1];
			if (x == m - 1 && y == n - 1) {
				return distance[x][y];
			}
			for (int i = 0; i < 4; i++) {
				int nx = x + move[i];
				int ny = y + move[i + 1];
				if (nx >= 0 && nx < m && ny >= 0 && ny < n && distance[x][y] + grid[nx][ny] < distance[nx][ny]) {
					distance[nx][ny] = distance[x][y] + grid[nx][ny];
					if (grid[nx][ny] == 0) {
						deque.addFirst(new int[] { nx, ny });
					} else {
						deque.addLast(new int[] { nx, ny });
					}
				}
			}
		}
		return -1;
	}

}
