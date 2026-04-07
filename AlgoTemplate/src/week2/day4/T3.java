package week2.day4;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class T3 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static final int MOD = 998244353;

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		char[][] grid = new char[n + 1][m + 1];
		for (int i = 1; i <= n; i++) {
			String line = reader.readLine();
			for (int j = 1; j <= m; j++) {
				grid[i][j] = line.charAt(j - 1);
			}
		}

		long[][] preR = new long[n + 2][m + 2];
		long[][] sufG = new long[n + 2][m + 2];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				preR[i][j] = preR[i - 1][j] + preR[i][j - 1] - preR[i - 1][j - 1] + (grid[i][j] == 'R' ? 1 : 0);
			}
		}

		for (int i = n; i >= 1; i--) {
			for (int j = m; j >= 1; j--) {
				sufG[i][j] = sufG[i + 1][j] + sufG[i][j + 1] - sufG[i + 1][j + 1] + (grid[i][j] == 'G' ? 1 : 0);
			}
		}

		long ans = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (grid[i][j] == 'O') {
					long leftUpR = preR[i][j];
					long rightDownG = sufG[i][j];
					ans = (ans + (leftUpR % MOD) * (rightDownG % MOD)) % MOD;
				}
			}
		}

		writer.println(ans);

		writer.flush();
		writer.close();
		reader.close();
	}

}
