package week2.day4;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T4 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static final int MAXN = (int) 1e3 + 2;
	private static final int[][] diff = new int[MAXN][MAXN];
	private static int n, q;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			q = (int) st.nval;
			while (q-- > 0) {
				int a, b, c, d;
				st.nextToken();
				a = (int) st.nval;
				st.nextToken();
				b = (int) st.nval;
				st.nextToken();
				c = (int) st.nval;
				st.nextToken();
				d = (int) st.nval;
				add(a, b, c, d, 1);
			}
			build();
			for (int i = 1; i <= n; i++) {
				StringBuilder sb = new StringBuilder();
				for (int j = 1; j <= n; j++) {
					sb.append(diff[i][j]).append(" ");
				}
				writer.println(sb.toString().trim());
			}
			clear();
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static void add(int a, int b, int c, int d, int k) {
		diff[a][b] += k;
		diff[c + 1][b] -= k;
		diff[a][d + 1] -= k;
		diff[c + 1][d + 1] += k;
	}

	private static void build() {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				diff[i][j] += diff[i - 1][j] + diff[i][j - 1] - diff[i - 1][j - 1];
			}
		}
	}

	private static void clear() {
		for (int i = 1; i <= n + 1; i++) {
			for (int j = 1; j <= n + 1; j++) {
				diff[i][j] = 0;
			}
		}
	}

}
