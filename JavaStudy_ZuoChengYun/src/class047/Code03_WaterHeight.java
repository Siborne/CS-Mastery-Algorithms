package class047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Code03_WaterHeight {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static final int MAXN = 1000001;
	private static final int OFFSET = 30001;

	private static int[] arr = new int[OFFSET + MAXN + OFFSET];
	private static int n, m;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			m = (int) st.nval;
			for (int i = 0, v, x; i < n; i++) {
				st.nextToken();
				v = (int) st.nval;
				st.nextToken();
				x = (int) st.nval;
				fall(v, x);
			}
			build();
			int start = OFFSET + 1;
			writer.print(arr[start++]);
			for (int i = 2; i <= m; i++) {
				writer.print(" " + arr[start++]);
			}
			writer.println();
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static void fall(int v, int x) {
		set(x - v * 3 + 1, x - 2 * v, 1, v, 1);
		set(x - 2 * v + 1, x, v - 1, -v, -1);
		set(x + 1, x + 2 * v, -v + 1, v, 1);
		set(x + 2 * v + 1, x + 3 * v - 1, v - 1, 1, -1);
	}

	private static void set(int l, int r, int s, int e, int d) {
		arr[l + OFFSET] += s;
		arr[l + 1 + OFFSET] += d - s;
		arr[r + 1 + OFFSET] -= d + e;
		arr[r + 2 + OFFSET] += e;
	}

	private static void build() {
		for (int i = 1; i <= m + OFFSET; i++) {
			arr[i] += arr[i - 1];
		}
		for (int i = 1; i <= m + OFFSET; i++) {
			arr[i] += arr[i - 1];
		}
	}
}
