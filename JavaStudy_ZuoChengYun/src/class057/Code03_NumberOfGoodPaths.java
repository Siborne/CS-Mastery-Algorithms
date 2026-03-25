package class057;

import java.util.Arrays;

public class Code03_NumberOfGoodPaths {

	private static final int MAXN = (int) 3e4 + 1;

	private static int[] father = new int[MAXN];
	private static int[] maxCnt = new int[MAXN];
	private static int[] stack = new int[MAXN];

	private static void build(int n) {
		for (int i = 0; i < n; i++) {
			father[i] = i;
			maxCnt[i] = 1;
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

	private static int union(int x, int y, int[] vals) {
		int fx = find(x);
		int fy = find(y);
		int path = 0;
		
		if (vals[fx]>vals[fy]) {
			father[fy] = fx;
		}else if (vals[fx]<vals[fy]) {
			father[fx] = fy;
		}else {
			path = maxCnt[fx] *maxCnt[fy];
			maxCnt[fx] += maxCnt[fy];
			father[fy] = fx;
		}
		
		return path;
	}

	public int numberOfGoodPaths(int[] vals, int[][] edges) {
		int n = vals.length;
		build(n);
		Arrays.sort(edges, (o1, o2) -> Math.max(vals[o1[0]], vals[o1[1]]) - Math.max(vals[o2[0]], vals[o2[1]]));
		int ans = n;
		for (int[] edge : edges) {
			ans += union(edge[0], edge[1], vals);
		}
		return ans;
	}

}
