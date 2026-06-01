package global;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T14 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			long a = (long) st.nval;
			st.nextToken();
			long b = (long) st.nval;
			st.nextToken();
			long c = (long) st.nval;

			long[] s = new long[n + 1];
			for (int i = 1; i < s.length; i++) {
				st.nextToken();
				s[i] = (long) st.nval;
			}

			long[] p = new long[n + 1];
			for (int i = 1; i < p.length; i++) {
				p[i] = p[i - 1] + s[i];
			}

			long ab = a * b;
			long ac = a * c;
			long[] f = new long[n + 1];
			long[] g = new long[n];

			for (int i = 0; i <= n; i++) {
				f[i] = p[i] - ab * i;
			}
			for (int i = 0; i < n; i++) {
				g[i] = p[i] - ac * (i + 1);
			}

			int left = 1;
			int right = n;
			int ans = 1;
			while (left <= right) {
				int mid = (left + right) >> 1;
				if (check(f, g, n, mid)) {
					ans = mid;
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static boolean check(long[] f, long[] g, int n, int len) {
		for (int i = 0; i + len <= n; i++) {
			if (f[i + len] > g[i]) {
				return true;
			}
		}
		return false;
	}

}
