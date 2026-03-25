package class060;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Code01_FoodLines {

	private static final int MAXN = (int) 5e3 + 1;
	private static final int MAXM = (int) 5e5 + 1;
	private static final int MOD = 80112002;

	private static int[] head = new int[MAXN];
	private static int[] next = new int[MAXM];
	private static int[] to = new int[MAXM];

	private static int cnt;

	private static int[] queue = new int[MAXN];

	private static int[] indegree = new int[MAXN];

	private static int[] lines = new int[MAXN];

	private static int n, m;

	private static void build(int n) {
		cnt = 1;
		Arrays.fill(indegree, 0, n + 1, 0);
		Arrays.fill(lines, 0, n + 1, 0);
		Arrays.fill(head, 0, n + 1, 0);
	}

	private static void addEdge(int u, int v) {
		next[cnt] = head[u];
		to[cnt] = v;
		head[u] = cnt++;
	}

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			m = (int) st.nval;
			build(n);
			for (int i = 0, u, v; i < m; i++) {
				st.nextToken();
				u = (int) st.nval;
				st.nextToken();
				v = (int) st.nval;
				addEdge(u, v);
				indegree[v]++;
			}
			writer.println(ways());
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static int ways() {
		int l = 0;
		int r = 0;
		for (int i = 1; i <= n; i++) {
			if (indegree[i] == 0) {
				queue[r++] = i;
				lines[i] = 1;
			}
		}
		int ans = 0;
		while (l < r) {
			int u = queue[l++];
			if (head[u] == 0) {
				ans = (ans + lines[u]) % MOD;
			} else {
				for (int ei = head[u], v; ei > 0; ei = next[ei]) {
					v = to[ei];
					lines[v] = (lines[v] + lines[u]) % MOD;
					if (--indegree[v] == 0) {
						queue[r++] = v;
					}
				}
			}
		}
		return ans;
	}

}
