package class065;

import java.util.Arrays;

public class Code03_BellmanFord {

	public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
		int[] cur = new int[n];
		Arrays.fill(cur, Integer.MAX_VALUE);
		cur[src] = 0;
		for (int i = 0; i <= k; i++) {
			int[] next = Arrays.copyOf(cur, n);
			for (int[] edge : flights) {
				if (cur[edge[0]] != Integer.MAX_VALUE) {
					next[edge[1]] = Math.min(next[edge[1]], cur[edge[0]] + edge[2]);
				}
			}
			cur = next;
		}
		return cur[dst] == Integer.MAX_VALUE ? -1 : cur[dst];
	}

}
