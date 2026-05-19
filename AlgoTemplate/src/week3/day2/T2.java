package week3.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Iterator;
import java.util.StringTokenizer;

public class T2 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int m = (int) st.nval;

			int[] l = new int[n + 2];
			int[] r = new int[n + 2];
			for (int i = 1; i <= n; i++) {
				l[i] = i - 1;
				r[i] = i + 1;
			}
			r[0] = 1;
			l[n + 1] = n;
			for (int idx = 0; idx < m; idx++) {
				st.nextToken();
				int op = (int) st.nval;
				if (op == 1) {
					st.nextToken();
					int p = (int) st.nval;
					int lp = l[p];
					int rp = r[p];
					r[lp] = rp;
					l[rp] = lp;
					int r0 = r[0];
					r[0] = p;
					l[p] = 0;
					r[p] = r0;
					l[r0] = p;
				} else if (op == 2) {
					st.nextToken();
					int p = (int) st.nval;
					int lp = l[p];
					int rp = r[p];
					l[rp] = lp;
					r[lp] = rp;
					int ln1 = l[n + 1];
					r[ln1] = p;
					l[p] = ln1;
					r[p] = n + 1;
					l[n + 1] = p;
				} else if (op == 3) {
					st.nextToken();
					int p = (int) st.nval;
					st.nextToken();
					int q = (int) st.nval;
					if (p == q) {
						continue;
					}
					int lp = l[p];
					int rp = r[p];
					l[rp] = lp;
					r[lp] = rp;
					int rq = r[q];
					r[q] = p;
					l[p] = q;
					r[p] = rq;
					l[rq] = p;
				}
			}
			StringBuilder sb = new StringBuilder();
			for (int cur = r[0]; cur != n + 1; cur = r[cur]) {
				sb.append(cur).append(" ");
			}
			System.out.println(sb.toString());
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
