package Day121;

import java.util.Arrays;

public class Demo4 {

	public int uniquePaths(int m, int n) {
		int[][] arr = new int[m][n];
		Arrays.fill(arr[0], 1);
		for (int i = 0; i < m; i++) {
			arr[i][0] = 1;
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				arr[i][j] = arr[i-1][j]+arr[i][j-1];
			}
		}
		return arr[m-1][n-1];
	}
	
	public static void main(String[] args) {
		Demo4 test = new Demo4();
		System.out.println(test.uniquePaths(3, 7));
	}

}
