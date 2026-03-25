package class064;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Code01_DijkstraLeetcode {

	public int networkDelayTime(int[][] times, int n, int k) {
		ArrayList<ArrayList<int[]>> graph = new ArrayList<>();
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<>());
		}
		for (int[] edge : times) {
			graph.get(edge[0]).add(new int[] { edge[1], edge[2] });
		}
		int[] distance = new int[n + 1];
		Arrays.fill(distance, Integer.MAX_VALUE);
		distance[k] = 0;
		boolean[] visited = new boolean[n + 1];
		PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
		heap.add(new int[] { k, 0 });
		while (!heap.isEmpty()) {
			int u = heap.poll()[0];
			if (visited[u]) {
				continue;
			}
			visited[u] = true;
			for (int[] edge : graph.get(u)) {
				int v = edge[0];
				int w = edge[1];
				if (!visited[v] && distance[u] + w < distance[v]) {
					distance[v] = distance[u] + w;
					heap.add(new int[] { v, distance[v] });
				}
			}
		}
		int ans = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			if (distance[i] == Integer.MAX_VALUE) {
				return -1;
			}
			ans = Math.max(ans, distance[i]);
		}
		return ans;
	}

	public int networkDelayTime2(int[][] times, int n, int k) {
		build(n);
		for (int[] edge : times) {
			addEdge(edge[0], edge[1], edge[2]);
		}
		addOrUpdateOrIgnore(k, 0);
		while (!isEmpty()) {
			int u = pop();
			for (int ei = head[u]; ei > 0; ei = next[ei]) {
				addOrUpdateOrIgnore(to[ei], distance[u] + weight[ei]);
			}
		}
		int ans = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			if (distance[i] == Integer.MAX_VALUE) {
				return -1;
			}
			ans = Math.max(ans, distance[i]);
		}
		return ans;
	}

	private static final int MAXN = 101;
	private static final int MAXM = 6001;

	private static int[] head = new int[MAXN];
	private static int[] next = new int[MAXM];
	private static int[] to = new int[MAXM];
	private static int[] weight = new int[MAXM];
	private static int cnt;

	private static int[] heap = new int[MAXN];

	private static int[] where = new int[MAXN];

	private static int heapSize;

	private static int[] distance = new int[MAXN];

	private static void build(int n) {
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

	private static void addOrUpdateOrIgnore(int v, int c) {
		if (where[v] == -1) {
			heap[heapSize] = v;
			where[v] = heapSize++;
			distance[v] = c;
			heapInsert(where[v]);
		} else if (where[v] >= 0) {
			distance[v] = Math.min(distance[v], c);
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

}
