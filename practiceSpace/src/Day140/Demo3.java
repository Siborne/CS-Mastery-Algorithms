package Day140;

public class Demo3 {
	public void setZeroes(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;

		boolean[] rowHasZero = new boolean[m];
		boolean[] colHasZero = new boolean[n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0) {
					rowHasZero[i] = true;
					colHasZero[j] = true;
				}
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (rowHasZero[i] || colHasZero[j]) {
					matrix[i][j] = 0;
				}
			}
		}

	}
}
