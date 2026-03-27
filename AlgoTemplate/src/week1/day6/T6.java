package week1.day6;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T6 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int m = (int) st.nval;

			int[][] board = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					st.nextToken();
					board[i][j] = (int) st.nval;
				}
			}

			boolean[][] toRemove = new boolean[n][m];
			for (int i = 0; i < n; i++) {
				int j = 0;
				while (j < m) {
					int color = board[i][j];
					int start = j;
					while (j < m && board[i][j] == color) {
						j++;
					}
					int len = j - start;
					if (len >= 3) {
						for (int k = start; k < j; k++) {
							toRemove[i][k] = true;
						}
					}
				}
			}

			for (int j = 0; j < m; j++) {
				int i = 0;
				while (i < n) {
					int color = board[i][j];
					int start = i;
					while (i < n && board[i][j] == color) {
						i++;
					}
					int len = i - start;
					if (len >= 3) {
						for (int k = start; k < i; k++) {
							toRemove[k][j] = true;
						}
					}
				}
			}

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (j > 0) {
						sb.append(" ");
					}
					sb.append(toRemove[i][j] ? 0 : board[i][j]);
				}
				sb.append("\n");
			}
			writer.println(sb.toString());
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
