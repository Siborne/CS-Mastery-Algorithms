package Day140;

import java.util.ArrayList;
import java.util.List;

public class Demo4 {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList<>();
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return list;
		}

		int rows = matrix.length;
		int cols = matrix[0].length;

		boolean[][] visited = new boolean[rows][cols];
		int total = rows * cols;
		int row = 0;
		int col = 0;
		int[][] directions = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
		int directionIndex = 0;
		for (int i = 0; i < total; i++) {
			list.add(matrix[row][col]);
			visited[row][col] = true;
			int nextRow = row + directions[directionIndex][0];
			int nextCol = col + directions[directionIndex][1];
			if (nextRow < 0 || nextRow >= rows || nextCol < 0 || nextCol >= cols || visited[nextRow][nextCol]) {
				directionIndex = (directionIndex + 1) % 4;
			}
			row += directions[directionIndex][0];
			col += directions[directionIndex][1];
		}
		return list;
	}
}
