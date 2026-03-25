package class061;

import java.util.Arrays;

public class Code03_OptimizeWaterDistribution {

	private static final int MAXN = (int) 1e4 + 10;

	private static int[][] edges = new int[MAXN << 1][3];

	private static int cnt;

	private static int[] father = new int[MAXN];
	private static int[] size = new int[MAXN];

	private static int[] stack = new int[MAXN];

	private static void build(int n) {
		cnt = 0;
		for (int i = 0; i <= n; i++) {
			father[i] = i;
			size[i] = 1;
		}
	}

	private static int find(int x) {
		int size = 0;
		while (x != father[x]) {
			stack[size++] = x;
			x = father[x];
		}
		while (size > 0) {
			father[stack[--size]] = x;
		}
		return x;
	}

	private static boolean union(int x, int y) {
		int fx = find(x);
		int fy = find(y);
		if (fx == fy) {
			return false;
		}
		if (size[fx] > size[fy]) {
			size[fx] += size[fy];
			father[fy] = fx;
		} else {
			size[fy] += size[fx];
			father[fx] = fy;
		}
		return true;
	}

	public static int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
		build(n);
		for (int i = 0; i < n; i++, cnt++) {
			edges[cnt][0] = 0;
			edges[cnt][1] = i + 1;
			edges[cnt][2] = wells[i];
		}
		for (int i = 0; i < pipes.length; i++, cnt++) {
			edges[cnt][0] = pipes[i][0];
			edges[cnt][1] = pipes[i][1];
			edges[cnt][2] = pipes[i][2];
		}
		Arrays.sort(edges, 0, cnt, (a, b) -> a[2] - b[2]);
		int ans = 0;
		for (int i = 0; i < cnt; i++) {
			if (union(edges[i][0], edges[i][1])) {
				ans += edges[i][2];
			}
		}
		return ans;
	}

}
