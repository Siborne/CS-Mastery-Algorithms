package Day108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo3 {

	private static BufferedReader reader;
	private static StreamTokenizer st;
	private static PrintWriter writer;

	static {
		reader = new BufferedReader(new InputStreamReader(System.in));
		st = new StreamTokenizer(reader);
		writer = new PrintWriter(new OutputStreamWriter(System.out));
	}

	private static final int MAXN = (int) 1e5 + 10;
	private static final int[] l = new int[MAXN];
	private static final int[] r = new int[MAXN];
	private static final boolean[] d = new boolean[MAXN];
	private static int n, m;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;

			insert(0, 1, 1);

			for (int i = 2; i <= n; i++) {
				st.nextToken();
				int k = (int) st.nval;
				st.nextToken();
				int p = (int) st.nval;
				insert(k, i, p);
			}
			st.nextToken();
			m = (int) st.nval;
			for (int i = 0; i < m; i++) {
				st.nextToken();
				int x = (int) st.nval;
				d[x] = true;
			}

			StringBuilder sb = new StringBuilder();
			int cur = 1;
			while (l[cur] != 0) {
				cur = l[cur];
			}

			while (cur != 0) {
				if (!d[cur]) {
					sb.append(cur).append(" ");
				}
				cur = r[cur];
			}

			writer.println(sb.toString().trim());
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static void insert(int i, int k, int fx) {
		if (fx == 1) {
			l[k] = i;
			r[k] = r[i];
			if (r[i] != 0) {
				l[r[i]] = k;
			}
			r[i] = k;
		} else {
			r[k] = i;
			l[k] = l[i];
			if (l[i] != 0) {
				r[l[i]] = k;
			}
			l[i] = k;
		}
	}

}
