package week3.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T5 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static long ans = 0;
	private static int[] a;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			a = new int[n + 1];
			for (int i = 1; i <= n; i++) {
				st.nextToken();
				a[i] = (int) st.nval;
			}

			solve(1, n);
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static int[] solve(int l, int r) {
		if (l == r) {
			return new int[] { a[l], a[l] };
		}
		int mid = (l + r) >>> 1;
		int[] left = solve(l, mid);
		int[] right = solve(mid + 1, r);
		ans += (long) left[0] * right[1];
		return new int[] { Math.max(left[0], right[0]), Math.min(left[1], right[1]) };
	}

}
