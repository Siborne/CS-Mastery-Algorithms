package week2.day4;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T5 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int m = (int) st.nval;

			int[][] diff = new int[n + 2][n + 2];
			while (m-- > 0) {
				st.nextToken();
				int x1 = (int) st.nval;
				st.nextToken();
				int y1 = (int) st.nval;
				st.nextToken();
				int x2 = (int) st.nval;
				st.nextToken();
				int y2 = (int) st.nval;

				diff[x1][y1] ^= 1;
				diff[x1][y2 + 1] ^= 1;
				diff[x2 + 1][y1] ^= 1;
				diff[x2 + 1][y2 + 1] ^= 1;
			}

			for (int i = 1; i <= n; i++) {
				StringBuilder sb = new StringBuilder();
				for (int j = 1; j <= n; j++) {
					diff[i][j] ^= diff[i - 1][j] ^ diff[i][j - 1] ^ diff[i - 1][j - 1];
					sb.append(diff[i][j]);
				}
				writer.println(sb.toString());
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
