package Day90;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo2 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private final static int MAXN = 10000 + 5;

	private static int[] a, b, g, k;

	static {
		a = new int[MAXN];
		b = new int[MAXN];
		g = new int[MAXN];
		k = new int[MAXN];
	}
	private static int x, y;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			for (int i = 0; i < n; i++) {
				st.nextToken();
				a[i] = (int) st.nval;
				st.nextToken();
				b[i] = (int) st.nval;
				st.nextToken();
				g[i] = (int) st.nval;
				st.nextToken();
				k[i] = (int) st.nval;
			}
			st.nextToken();
			x = (int) st.nval;
			st.nextToken();
			y = (int) st.nval;
			int ans = -1;
			for (int i = 0; i < n; i++) {
				if (x >= a[i] && y >= b[i] && x <= a[i] + g[i] && y <= b[i] + k[i]) {
					ans = i + 1;
				}
			}
			writer.println(ans);
		}

		writer.flush();
		writer.close();
		reader.close();
	}

}
