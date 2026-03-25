package class059;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Code02_TopoSortStaticNowcoder {

	private static final int MAXN = (int) 2e5 + 1;
	private static final int MAXM = (int) 2e5 + 1;
	private static int[] head = new int[MAXN];
	private static int[] next = new int[MAXM];
	private static int[] to = new int[MAXM];

	private static int cnt;

	private static int[] queue = new int[MAXM];

	private static int l, r;

	private static int[] indegree = new int[MAXN];

	private static int[] ans = new int[MAXN];

	private static int n, m;

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static void build(int n) {
		cnt = 1;
		Arrays.fill(head, 0, n + 1, 0);
		Arrays.fill(indegree, 0, n + 1, 0);
	}

	private static void addEdge(int f, int t) {
		next[cnt] = head[f];
		to[cnt] = t;
		head[f] = cnt++;
	}

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			m = (int) st.nval;
			build(n);
			for (int i = 0, from, to; i < m; i++) {
				st.nextToken();
				from = (int) st.nval;
				st.nextToken();
				to = (int) st.nval;
				addEdge(from, to);
				indegree[to]++;
			}
			if (!topoSort()) {
				writer.println(-1);
			} else {
				for (int i = 0; i < n - 1; i++) {
					writer.println(ans[i] + " ");
				}
				writer.println(ans[n - 1]);
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static boolean topoSort() {
		l = r = 0;
		for (int i = 1; i <= n; i++) {
			if (indegree[i] == 0) {
				queue[r++] = i;
			}
		}
		int fill = 0;
		while (l < r) {
			int cur = queue[l++];
			ans[fill++] = cur;
			for (int ei = head[cur]; ei != 0; ei = next[ei]) {
				if (--indegree[to[ei]] == 0) {
					queue[r++] = to[ei];
				}
			}
		}
		return fill == n;
	}

}
