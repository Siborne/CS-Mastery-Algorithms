package Day26;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.StringTokenizer;

public class Demo1 {

	private static int MOD = 2333;
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		int[][] grid = new int[m][n];

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(reader.readLine());
			for (int j = 0; j < n; j++) {
				grid[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int[][] dp = new int[m][n];
		if (grid[m - 1][0] == 0) {
			dp[m - 1][0] = 1;
		}

		for (int i = m - 1; i >= 0; i--) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 1) {
					continue;
				}

				if (i + 1 < m && grid[i + 1][j] == 0) {
					dp[i][j] = (dp[i][j] + dp[i + 1][j]) % MOD;
				}

				if (j - 1 >= 0 && grid[i][j - 1] == 0) {
					dp[i][j] = (dp[i][j] + dp[i][j - 1]) % MOD;
				}

			}
		}
		System.out.println(dp[0][n - 1]);
	}

}
