package class061;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Code02_PrimStatic {

	private static int MAXN = (int) 5e3 + 1;
	private static int MAXM = (int) 4e5 + 1;

	private static int n, m;

	private static int[] head = new int[MAXN];
	private static int[] next = new int[MAXM];
	private static int[] to = new int[MAXM];
	private static int[] weight = new int[MAXM];
	private static int cnt;

	private static int[][] heap = new int[MAXN][2];
	private static int[] where = new int[MAXN];
	private static int heapSize;

	private static int nodeCnt;

	private static void build() {
		cnt = 1;
		heapSize = 0;
		nodeCnt = 0;
		Arrays.fill(head, 1, n + 1, 0);
		Arrays.fill(where, 1, n + 1, -1);
	}

	private static void addEdge(int u, int v, int w) {
		next[cnt] = head[u];
		to[cnt] = v;
		weight[cnt] = w;
		head[u] = cnt++;
	}

	private static void addOrUpdateOrIgnore(int ei) {
		int v = to[ei];
		int w = weight[ei];
		if (where[v] == -1) {
			heap[heapSize][0] = v;
			heap[heapSize][1] = w;
			where[v] = heapSize++;
			heapInsert(where[v]);
		} else if (where[v] >= 0) {
			heap[where[v]][1] = Math.min(heap[where[v]][1], w);
			heapInsert(where[v]);
		}
	}

	private static void heapInsert(int i) {
		while (heap[i][1] < heap[(i - 1) / 2][1]) {
			swap(i, (i - 1) / 2);
			i = (i - 1) / 2;
		}
	}

	private static int u;

	private static int w;

	private static void pop() {
		u = heap[0][0];
		w = heap[0][1];
		swap(0, --heapSize);
		heapify(0);
		where[u] = -2;
		nodeCnt++;
	}

	private static void heapify(int i) {
		int l = i * 2 + 1;
		while (l < heapSize) {
			int best = l + 1 < heapSize && heap[l + 1][1] < heap[l][1] ? l + 1 : l;
			best = heap[best][1] < heap[i][1] ? best : i;
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
		int a = heap[i][0];
		int b = heap[j][0];
		where[a] = j;
		where[b] = i;
		int[] tmp = heap[i];
		heap[i] = heap[j];
		heap[j] = tmp;
	}

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			m = (int) st.nval;
			build();
			for (int i = 0, u, v, w; i < m; i++) {
				st.nextToken();
				u = (int) st.nval;
				st.nextToken();
				v = (int) st.nval;
				st.nextToken();
				w = (int) st.nval;
				addEdge(u, v, w);
				addEdge(v, u, w);
			}
			int ans = prim();
			writer.println(nodeCnt == n ? ans : "orz");
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static int prim() {
		nodeCnt = 1;
		where[1] = -2;
		for (int ei = head[1]; ei > 0; ei = next[ei]) {
			addOrUpdateOrIgnore(ei);
		}
		int ans = 0;
		while (!isEmpty()) {
			pop();
			ans += w;
			for (int ei = head[u]; ei > 0; ei = next[ei]) {
				addOrUpdateOrIgnore(ei);
			}
		}
		return ans;
	}

}
