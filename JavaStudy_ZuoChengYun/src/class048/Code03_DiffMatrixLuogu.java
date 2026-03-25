package class048;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Code03_DiffMatrixLuogu {

	private static BufferedReader reader;
	private static StreamTokenizer st;
	private static PrintWriter writer;

	static {
		reader = new BufferedReader(new InputStreamReader(System.in));
		st = new StreamTokenizer(reader);
		writer = new PrintWriter(new OutputStreamWriter(System.out));
	}

	private static final int MAXN = 1002;
	private static final int[][] diff = new int[MAXN][MAXN];
	private static int n, q;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			q = (int) st.nval;
			for (int i = 1, a, b, c, d; i <= q; i++) {
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
				writer.print(diff[i][1]);
				for (int j = 2; j <= n; j++) {
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
