package week3.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T4 {

	private static class Query {
		int l;
		int r;
		int id;

		Query(int l, int r, int id) {
			this.l = l;
			this.r = r;
			this.id = id;
		}
	}

	private static class BIT {
		int[] c;
		int n;

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

		int query(int l, int r) {
			return sum(r) - sum(l - 1);
		}

	}

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int q = (int) st.nval;
			st.nextToken();
			int x = (int) st.nval;

			int[] a = new int[n + 1];
			for (int i = 1; i <= n; i++) {
				st.nextToken();
				a[i] = (int) st.nval;
			}

			Map<Integer, Integer> map = new HashMap<>();
			int INF = n + 1;
			int[] minR = new int[n + 2];
			Arrays.fill(minR, INF);
			for (int j = n; j >= 1; j--) {
				int target = a[j] ^ x;
				Integer pos = map.get(target);
				if (pos != null) {
					minR[j] = pos;
				}
				map.put(a[j], j);
			}

			List<int[]> pairs = new ArrayList<>();
			for (int j = 1; j <= n; j++) {
				if (minR[j] <= n) {
					pairs.add(new int[] { minR[j], j });
				}
			}
			pairs.sort(Comparator.comparingInt(o -> o[0]));

			Query[] queries = new Query[q];
			for (int i = 0; i < q; i++) {
				st.nextToken();
				int l = (int) st.nval;
				st.nextToken();
				int r = (int) st.nval;
				queries[i] = new Query(l, r, i);
			}
			Arrays.sort(queries, Comparator.comparingInt(o -> o.r));

			BIT bit = new BIT(n);
			String[] ans = new String[q];
			int ptr = 0;
			for (Query qu : queries) {
				while (ptr < pairs.size() && pairs.get(ptr)[0] <= qu.r) {
					bit.add(pairs.get(ptr)[1], 1);
					ptr++;
				}
				if (bit.query(qu.l, n) > 0) {
					ans[qu.id] = "Yes";
				} else {
					ans[qu.id] = "No";
				}
			}

			for (int i = 0; i < q; i++) {
				writer.println(ans[i]);
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
