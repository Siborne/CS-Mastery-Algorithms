package class064;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.PriorityQueue;

public class Code06_FlightPath1 {

	private static final int MAXN = (int) 1e4 + 1;
	private static final int MAXM = (int) 1e5 + 1;
	private static final int MAXK = (int) 1e1 + 1;

	private static int[] head = new int[MAXN];
	private static int[] next = new int[MAXM];
	private static int[] to = new int[MAXM];
	private static int[] weight = new int[MAXM];
	private static int cnt;

	private static int[][] distance = new int[MAXN][MAXK];

	private static boolean[][] visited = new boolean[MAXN][MAXK];

	private static PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[2] - b[2]);

	private static int n, m, k, s, t;

	private static void build() {
		cnt = 1;
		for (int i = 0; i < n; i++) {
			head[i] = 0;
			for (int j = 0; j <= k; j++) {
				distance[i][j] = Integer.MAX_VALUE;
				visited[i][j] = false;
			}
		}
		heap.clear();
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
			n = (int) st.nval;
			st.nextToken();
			m = (int) st.nval;
			st.nextToken();
			k = (int) st.nval;
			st.nextToken();
			s = (int) st.nval;
			st.nextToken();
			t = (int) st.nval;
			build();
			for (int i = 0, a, b, c; i < m; i++) {
				st.nextToken();
				a = (int) st.nval;
				st.nextToken();
				b = (int) st.nval;
				st.nextToken();
				c = (int) st.nval;
				addEdge(a, b, c);
				addEdge(b, a, c);
			}
			writer.println(dijkstra());
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static int dijkstra() {
		distance[s][0] = 0;
		heap.add(new int[] { s, 0, 0 });
		while (!heap.isEmpty()) {
			int[] record = heap.poll();
			int u = record[0];
			int use = record[1];
			int cost = record[2];
			if (visited[u][use]) {
				continue;
			}
			visited[u][use] = true;
			if (u == t) {
				return cost;
			}
			for (int ei = head[u], v, w; ei > 0; ei = next[ei]) {
				v = to[ei];
				w = weight[ei];
				if (use < k && distance[v][use + 1] > distance[u][use]) {
					distance[v][use + 1] = distance[u][use];
					heap.add(new int[] { v, use + 1, distance[v][use + 1] });
				}
				if (distance[v][use] > distance[u][use] + w) {
					distance[v][use] = distance[u][use] + w;
					heap.add(new int[] {v,use,distance[v][use]});
				}
			}
		}
		return -1;
	}

}
