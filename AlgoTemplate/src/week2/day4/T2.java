package week2.day4;

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

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int m = (int) st.nval;
			st.nextToken();
			int c = (int) st.nval;

			long[][] sum = new long[n + 1][m + 1];

			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {
					st.nextToken();
					long val = (long) st.nval;
					sum[i][j] = val + sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1];
				}
			}
			st.nextToken();
			int t = (int) st.nval;
			while (t-- > 0) {
				st.nextToken();
				int x1 = (int) st.nval;
				st.nextToken();
				int y1 = (int) st.nval;
				st.nextToken();
				int x2 = (int) st.nval;
				st.nextToken();
				int y2 = (int) st.nval;
				st.nextToken();
				long k = (long) st.nval;
				long total = sum[x2][y2] - sum[x1 - 1][y2] - sum[x2][y1 - 1] + sum[x1 - 1][y1 - 1];
				long area = (long) (x2 - x1 + 1) * (y2 - y1 + 1);
				long r = k % (c + 1);

				if (r == 0) {
					writer.println(total);
				} else {
					writer.println(total - r * area);
				}

			}

		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
