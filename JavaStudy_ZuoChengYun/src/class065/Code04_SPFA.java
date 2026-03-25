package class065;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Code04_SPFA {

	private static final int MAXN = (int) 2e3 + 1;
	private static final int MAXM = (int) 6e3 + 1;

	private static int[] head = new int[MAXN];
	private static int[] next = new int[MAXM];
	private static int[] to = new int[MAXM];
	private static int[] weight = new int[MAXM];
	private static int cnt;

	private static final int MAXQ = (int) 4e6 + 1;

	private static int[] distance = new int[MAXN];
	private static int[] updateCnt = new int[MAXN];
	private static int[] queue = new int[MAXQ];

	private static int l, r;

	private static boolean[] enter = new boolean[MAXN];

	private static void build(int n) {
		cnt = 1;
		l = r = 0;
		Arrays.fill(head, 1, n + 1, 0);
		Arrays.fill(enter, 1, n + 1, false);
		Arrays.fill(distance, 1, n + 1, Integer.MAX_VALUE);
		Arrays.fill(updateCnt, 1, n + 1, 0);
	}

	private static void addEdge(int u, int v, int w) {
		next[cnt] = head[u];
		to[cnt] = v;
		weight[cnt] = w;
		head[u] = cnt++;
	}

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int cases = (int) st.nval;
			for (int i = 0, n, m; i < cases; i++) {
				st.nextToken();
				n = (int) st.nval;
				st.nextToken();
				m = (int) st.nval;
				build(n);
				for (int j = 0, u, v, w; j < m; j++) {
					st.nextToken();
					u = (int) st.nval;
					st.nextToken();
					v = (int) st.nval;
					st.nextToken();
					w = (int) st.nval;
					if (w >= 0) {
						addEdge(u, v, w);
						addEdge(v, u, w);
					} else {
						addEdge(u, v, w);
					}
				}
				writer.println(spfa(n) ? "YES" : "NO");
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static boolean spfa(int n) {
		distance[1] = 0;
		updateCnt[1]++;
		queue[r++] = 1;
		enter[1] = true;
		while (l < r) {
			int u = queue[l++];
			enter[u] = false;
			for (int ei = head[u], v, w; ei > 0; ei = next[ei]) {
				v = to[ei];
				w = weight[ei];
				if (distance[u] + w < distance[v]) {
					distance[v] = distance[u] + w;
					if (!enter[v]) {
						if (++updateCnt[v] > n - 1) {
							return true;
						}
						queue[r++] = v;
						enter[v] = true;
					}
				}
			}
		}
		return false;
	}

}
