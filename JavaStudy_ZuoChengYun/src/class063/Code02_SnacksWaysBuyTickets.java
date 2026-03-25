package class063;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Code02_SnacksWaysBuyTickets {

	private static final int MAXN = 40;
	private static final int MAXM = 1 << 20;
	private static long[] arr = new long[MAXN];
	private static long[] lsum = new long[MAXM];
	private static long[] rsum = new long[MAXM];

	private static int n;
	private static long w;

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			w = (long) st.nval;
			for (int i = 0; i < n; i++) {
				st.nextToken();
				arr[i] = (long) st.nval;
			}
			writer.println(compute());
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static long compute() {
		int lsize = f(0, n >> 1, 0, w, lsum, 0);
		int rsize = f(n >> 1, n, 0, w, rsum, 0);
		Arrays.sort(lsum, 0, lsize);
		Arrays.sort(rsum, 0, rsize);
		long ans = 0;
		for (int i = lsize - 1, j = 0; i >= 0; i--) {
			while (j < rsize && lsum[i] + rsum[j] <= w) {
				j++;
			}
			ans += j;
		}
		return ans;
	}

	private static int f(int i, int e, long s, long w, long[] ans, int j) {
		if (s > w) {
			return j;
		}
		if (i == e) {
			ans[j++] = s;
		} else {
			j = f(i + 1, e, s, w, ans, j);
			j = f(i + 1, e, s + arr[i], w, ans, j);
		}
		return j;
	}

}
