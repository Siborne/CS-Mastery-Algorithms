package class048;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Code03_DiffMatrixNowcoder {

	private static BufferedReader reader;
	private static StreamTokenizer st;
	private static PrintWriter writer;

	static {
		reader = new BufferedReader(new InputStreamReader(System.in));
		st = new StreamTokenizer(reader);
		writer = new PrintWriter(new OutputStreamWriter(System.out));
	}

	private static final int MAXN = 1005;
	private static final int MAXM = 1005;
	private static final long[][] diff = new long[MAXN][MAXM];
	private static int n, m, q;

	private static void add(int a, int b, int c, int d, int k) {
		diff[a][b] += k;
		diff[c + 1][b] -= k;
		diff[a][d + 1] -= k;
		diff[c + 1][d + 1] += k;
	}

	private static void build() {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				diff[i][j] += diff[i - 1][j] + diff[i][j - 1] - diff[i - 1][j - 1];
			}
		}
	}

	private static void clear() {
		for (int i = 1; i <= n + 1; i++) {
			for (int j = 1; j <= m + 1; j++) {
				diff[i][j] = 0;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			m = (int) st.nval;
			st.nextToken();
			q = (int) st.nval;
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {
					st.nextToken();
					add(i, j, i, j, (int) st.nval);
				}
			}
			for (int i = 1, a, b, c, d, k; i <= q; i++) {
				st.nextToken();
				a = (int) st.nval;
				st.nextToken();
				b = (int) st.nval;
				st.nextToken();
				c = (int) st.nval;
				st.nextToken();
				d = (int) st.nval;
				st.nextToken();
				k = (int) st.nval;
				add(a, b, c, d, k);
			}
			build();
			for (int i = 1; i <= n; i++) {
				writer.print(diff[i][1]);
				for (int j = 2; j <= m; j++) {
					writer.print(" " + diff[i][j]);
				}
				writer.println();
			}
			clear();
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
