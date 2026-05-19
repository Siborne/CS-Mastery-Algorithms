package week3.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T3 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static final int MAX_A = 1_000_000;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;

			int[] pos = new int[MAX_A + 1];

			int[] val = new int[n + 2];
			int[] pre = new int[n + 2];
			int[] nxt = new int[n + 2];

			int head = 0;
			int tail = 0;

			int tot = 0;
			int ans = 0;

			for (int i = 0; i < n; i++) {
				st.nextToken();
				int x = (int) st.nval;
				if (pos[x] != 0) {
					int u = pos[x];
					int l = pre[u];
					int r = nxt[u];

					if (l != 0) {
						if (((val[l] + val[u]) & 1) == 1) {
							ans--;
						}
						nxt[l] = r;
					} else {
						head = r;
					}

					if (r != 0) {
						if (((val[r] + val[u]) & 1) == 1) {
							ans--;
						}
						pre[r] = l;
					} else {
						tail = l;
					}

					if (l != 0 && r != 0) {
						if (((val[l] + val[r]) & 1) == 1) {
							ans++;
						}
					}
					pos[x] = 0;
				}
				tot++;
				val[tot] = x;
				pre[tot] = tail;
				nxt[tot] = 0;

				if (tail != 0) {
					if (((val[tail] + x) & 1) == 1) {
						ans++;
					}
					nxt[tail] = tot;
				} else {
					head = tot;
				}
				tail = tot;
				pos[x] = tot;

				writer.println(ans);
			}

		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
