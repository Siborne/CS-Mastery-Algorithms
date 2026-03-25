package class059;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Code03_TopoSortStaticLuogu {

	private static final int MAXN = (int) 1e5 + 1;
	private static final int MAXM = (int) 1e5 + 1;

	private static int[] head = new int[MAXN];
	private static int[] next = new int[MAXM];
	private static int[] to = new int[MAXM];

	private static int cnt;

	private static int[] heap = new int[MAXN];

	private static int heapSize;

	private static int[] indegree = new int[MAXN];

	private static int[] ans = new int[MAXN];

	private static int n, m;

	private static void build(int n) {
		cnt = 1;
		heapSize = 0;
		Arrays.fill(heap, 0, n + 1, 0);
		Arrays.fill(indegree, 0, n + 1, 0);
	}

	private static void addEdge(int f, int t) {
		next[cnt] = head[f];
		to[cnt] = t;
		head[f] = cnt++;
	}

	private static void push(int num) {
		int i = heapSize++;
		heap[i] = num;
		while (heap[i] < heap[(i - 1) / 2]) {
			swap(i, (i - 1) / 2);
			i = (i - 1) / 2;
		}
	}

	private static int pop() {
		int ans = heap[0];
		heap[0] = heap[--heapSize];
		int i = 0;
		int l = 1;
		while (l < heapSize) {
			int best = l + 1 < heapSize && heap[l + 1] < heap[l] ? l + 1 : l;
			best = heap[best] < heap[i] ? best : i;
			if (best == i) {
				break;
			}
			swap(best, i);
			i = best;
			l = i * 2 + 1;
		}
		return ans;
	}

	private static boolean isEmpty() {
		return heapSize == 0;
	}

	private static void swap(int i, int j) {
		int tmp = heap[i];
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
			build(n);
			for (int i = 0, from, to; i < m; i++) {
				st.nextToken();
				from = (int) st.nval;
				st.nextToken();
				to = (int) st.nval;
				addEdge(from, to);
				indegree[to]++;
			}
			topoSort();
			for (int i = 0; i < n - 1; i++) {
				writer.print(ans[i] + " ");
			}
			writer.println(ans[n - 1]);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static void topoSort() {
		for (int i = 1; i <= n; i++) {
			if (indegree[i] == 0) {
				push(i);
			}
		}
		int fill = 0;
		while (!isEmpty()) {
			int cur = pop();
			ans[fill++] = cur;
			for (int ei = head[cur]; ei != 0; ei = next[ei]) {
				if (--indegree[to[ei]] == 0) {
					push(to[ei]);
				}
			}
		}
	}

}
