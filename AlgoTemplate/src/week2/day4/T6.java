package week2.day4;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Iterator;

public class T6 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static final int MAXN = (int) 1e4 + 2;
	private static int[][] s = new int[MAXN][MAXN];
	private static int n;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			while (n-- > 0) {
				st.nextToken();
				int x1 = (int) st.nval + 1;
				st.nextToken();
				int y1 = (int) st.nval + 1;
				st.nextToken();
				int x2 = (int) st.nval + 1;
				st.nextToken();
				int y2 = (int) st.nval + 1;

				s[x1][y1] += 1;
				s[x1][y2] -= 1;
				s[x2][y1] -= 1;
				s[x2][y2] += 1;
			}

			long ans = 0;
			for (int i = 1; i < MAXN; i++) {
				for (int j = 1; j < MAXN; j++) {
					s[i][j] += s[i - 1][j] + s[i][j - 1] - s[i - 1][j - 1];
					if (s[i][j] > 0) {
						ans++;
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
