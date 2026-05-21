package week3.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T3 {

	private static class BIT {
		int n;
		int[] c;

		BIT(int n) {
			this.n = n;
			c = new int[n + 2];
		}

		void add(int x, int v) {
			for (; x <= n; x += x & -x) {
				c[x] += v;
			}
		}

		int sum(int x) {
			int s = 0;
			for (; x > 0; x -= x & -x) {
				s += c[x];
			}
			return s;
		}
	}

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int k = (int) st.nval;

			int[] p = new int[n + 1];
			for (int i = 1; i < p.length; i++) {
				st.nextToken();
				p[i] = (int) st.nval;
			}

			int[] left = new int[n + 1];

			BIT bit = new BIT(n);
			for (int i = 1; i <= n; i++) {
				left[i] = bit.sum(p[i] - 1);
				bit.add(p[i], 1);
			}

			long ans = 0;
			bit = new BIT(n);
			for (int i = n; i >= 1; i--) {
				int right = bit.sum(p[i] - 1);
				if (left[i] >= k && right >= k) {
					ans++;
				}
				bit.add(p[i], 1);
			}
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
