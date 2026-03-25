package class064;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Code01_DijkstraLuogu {

	private static final int MAXN = (int) 1e5 + 1;
	private static final int MAXM = (int) 2e5 + 1;

	private static int[] head = new int[MAXN];
	private static int[] next = new int[MAXM];
	private static int[] to = new int[MAXM];
	private static int[] weight = new int[MAXM];
	private static int cnt;

	private static int[] heap = new int[MAXN];
	private static int[] where = new int[MAXN];
	private static int heapSize;
	private static int[] distance = new int[MAXN];

	private static int n, m, s;

	private static void build() {
		cnt = 1;
		heapSize = 0;
		Arrays.fill(head, 1, n + 1, 0);
		Arrays.fill(where, 1, n + 1, -1);
		Arrays.fill(distance, 1, n + 1, Integer.MAX_VALUE);
	}

	private static void addEdge(int u, int v, int w) {
		next[cnt] = head[u];
		to[cnt] = v;
		weight[cnt] = w;
		head[u] = cnt++;
	}

	private static void addOrUpdateOrIgnore(int v, int w) {
		if (where[v] == -1) {
			heap[heapSize] = v;
			where[v] = heapSize++;
			distance[v] = w;
			heapInsert(where[v]);
		} else if (where[v] >= 0) {
			distance[v] = Math.min(distance[v], w);
			heapInsert(where[v]);
		}
	}

	private static void heapInsert(int i) {
		while (distance[heap[i]] < distance[heap[(i - 1) / 2]]) {
			swap(i, (i - 1) / 2);
			i = (i - 1) / 2;
		}
	}

	private static int pop() {
		int ans = heap[0];
		swap(0, --heapSize);
		heapify(0);
		where[ans] = -2;
		return ans;
	}

	private static void heapify(int i) {
		int l = i * 2 + 1;
		while (l < heapSize) {
			int best = l + 1 < heapSize && distance[heap[l + 1]] < distance[heap[l]] ? l + 1 : l;
			best = distance[heap[best]] < distance[heap[i]] ? best : i;
			if (best == i) {
				break;
			}
			swap(best, i);
			i = best;
			l = i * 2 + 1;
		}
	}

	private static boolean isEmpty() {
		return heapSize == 0;
	}

	private static void swap(int i, int j) {
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
		where[heap[i]] = i;
		where[heap[j]] = j;
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
			s = (int) st.nval;
			build();
			for (int i = 0, u, v, w; i < m; i++) {
				st.nextToken();
				u = (int) st.nval;
				st.nextToken();
				v = (int) st.nval;
				st.nextToken();
				w = (int) st.nval;
				addEdge(u, v, w);
			}
			dijkstra();
			StringBuilder sb = new StringBuilder();
			for (int i = 1; i <= n; i++) {
				sb.append(distance[i]).append(" ");
			}
			writer.println(sb.toString().trim());
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static void dijkstra() {
		addOrUpdateOrIgnore(s, 0);
		while (!isEmpty()) {
			int v = pop();
			for (int ei = head[v]; ei > 0; ei = next[ei]) {
				addOrUpdateOrIgnore(to[ei], distance[v] + weight[ei]);
			}
		}
	}

}
