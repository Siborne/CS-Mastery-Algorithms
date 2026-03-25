package Day140;

public class Demo2 {
	public int diagonalSum(int[][] mat) {
		int n = mat.length;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans += mat[i][i];
		}
		for (int i = 0, j = n - 1; i < mat.length; i++, j--) {
			ans += mat[i][j];
		}
		if ((n & 1) == 1) {
			ans -= mat[n / 2][n / 2];
		}
		return ans;
	}
}
