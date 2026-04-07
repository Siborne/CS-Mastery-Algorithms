package week2.day4;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T1 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int m = (int) st.nval;

			int[][] p = new int[n + 1][m + 1];

			for (int i = 1; i < p.length; i++) {
				for (int j = 1; j < p[0].length; j++) {
					st.nextToken();
					int val = (int) st.nval;
					p[i][j] = p[i - 1][j] + p[i][j - 1] - p[i - 1][j - 1] + val;
				}
			}

			int ans = 0;

			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {
					int maxK = Math.min(n - i + 1, m - j + 1);

					for (int k = 1; k <= maxK; k++) {
						int r = i + k - 1;
						int c = j + k - 1;
						int sum = p[r][c] - p[i - 1][c] - p[r][j - 1] + p[i - 1][j - 1];
						if (sum == k * k) {
							ans = Math.max(k, ans);
						} else {
							break;
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
