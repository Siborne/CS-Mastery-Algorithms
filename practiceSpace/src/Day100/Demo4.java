package Day100;

public class Demo4 {

	class Solution {
		public int[][] generateMatrix(int n) {
			int[][] res = new int[n][n];
			int startX = 0;
			int startY = 0;
			int offset = 1;
			int count = 1;
			int loop = 1;
			int i, j;

			while (loop <= n / 2) {
				for (j = startY; j < n - offset; j++) {
					res[startX][j] = count++;
				}

				for (i = startX; i < n - offset; i++) {
					res[i][j] = count++;
				}

				for (; j > startY; j--) {
					res[i][j] = count++;
				}

				for (; i > startX; i--) {
					res[i][j] = count++;
				}

				startX++;
				startY++;
				offset++;
				loop++;
			}

			if (n % 2 == 1) {
				res[startX][startY] = count;
			}

			return res;
		}
	}

}
