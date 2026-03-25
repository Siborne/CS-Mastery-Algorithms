package class047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Code02_ArithmeticSequenceDifference {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static final int MAXN = 10000005;
	private static final long[] arr = new long[MAXN];
	private static int n, m;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			m = (int) st.nval;
			for (int i = 0, l, r, s, e; i < m; i++) {
				st.nextToken();
				l = (int) st.nval;
				st.nextToken();
				r = (int) st.nval;
				st.nextToken();
				s = (int) st.nval;
				st.nextToken();
				e = (int) st.nval;
				set(l, r, s, e, (e - s) / (r - l));
			}
			build();
			long max = 0, xor = 0;
			for (int i = 1; i <= n; i++) {
				max = Math.max(max, arr[i]);
				xor ^= arr[i];
			}
			writer.println(xor + " " + max);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static void set(int l, int r, int s, int e, int d) {
		arr[l] += s;
		arr[l + 1] += d - s;
		arr[r + 1] -= d + e;
		arr[r + 2] += e;
	}

	private static void build() {
		for (int i = 1; i <= n; i++) {
			arr[i] += arr[i - 1];
		}
		for (int i = 1; i <= n; i++) {
			arr[i] += arr[i - 1];
		}
	}

}
