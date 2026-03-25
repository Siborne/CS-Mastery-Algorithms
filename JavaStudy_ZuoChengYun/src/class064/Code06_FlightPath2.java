package class064;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.PriorityQueue;

public class Code06_FlightPath2 {

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

	private static int[][] heap = new int[MAXM * MAXK][3];
	private static int heapSize;

	private static int n, m, k, s, t;

	private static void build() {
		cnt = 1;
		heapSize = 0;
		for (int i = 0; i < n; i++) {
			head[i] = 0;
			for (int j = 0; j <= k; j++) {
				distance[i][j] = Integer.MAX_VALUE;
				visited[i][j] = false;
			}
		}
	}

	private static void addEdge(int u, int v, int w) {
		next[cnt] = head[u];
		to[cnt] = v;
		weight[cnt] = w;
		head[u] = cnt++;
	}

	private static void push(int u, int t, int c) {
		heap[heapSize][0] = u;
		heap[heapSize][1] = t;
		heap[heapSize][2] = c;
		int i = heapSize++;
		while (heap[i][2] < heap[(i - 1) / 2][2]) {
			swap(i, (i - 1) / 2);
			i = (i - 1) / 2;
		}
	}

	private static int u, use, cost;

	private static void pop() {
		u = heap[0][0];
		use = heap[0][1];
		cost = heap[0][2];
		swap(0, --heapSize);
		heapify(0);
	}

	private static void heapify(int i) {
		int l = i * 2 + 1;
		while (l < heapSize) {
			int best = l + 1 < heapSize && heap[l + 1][2] < heap[l][2] ? l + 1 : l;
			best = heap[best][2] < heap[i][2] ? best : i;
			if (best == i) {
				break;
			}
			swap(best, i);
			i = best;
			l = i * 2 + 1;
		}
	}

	private static void swap(int i, int j) {
		int[] temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
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
		push(s, 0, 0);
		while (heapSize > 0) {
			pop();
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
					push(v, use + 1, distance[v][use + 1]);
				}
				if (distance[v][use] > distance[u][use] + w) {
					distance[v][use] = distance[u][use] + w;
					push(v, use, distance[v][use]);
				}
			}
		}
		return -1;
	}

}
