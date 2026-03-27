package week1.day5;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T2 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static final int MAXN = (int) 1e2 + 9;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int m = (int) st.nval;

			boolean[][] g = new boolean[MAXN][MAXN];
			int[][] p = new int[MAXN][MAXN];

			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {
					st.nextToken();
					g[i][j] = ((int) st.nval == 1);
				}
			}

			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {
					p[i][j] = p[i - 1][j] + p[i][j - 1] - p[i - 1][j - 1] + (!g[i][j] ? 1 : 0);
				}
			}

			int ans = -1;
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {
					for (int k = 1; k <= Math.min(n - i + 1, m - j + 1); k++) {
						int sum = p[i + k - 1][j + k - 1] - p[i - 1][j + k - 1] - p[i + k - 1][j - 1] + p[i - 1][j - 1];

						if (sum == 0) {
							ans = Math.max(ans, k);
						}
					}
				}
			}
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
