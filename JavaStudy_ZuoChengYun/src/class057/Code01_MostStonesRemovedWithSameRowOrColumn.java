package class057;

import java.util.HashMap;
import java.util.Map;

public class Code01_MostStonesRemovedWithSameRowOrColumn {

	private static Map<Integer, Integer> rowFirstMap = new HashMap<>();
	private static Map<Integer, Integer> colFirstMap = new HashMap<>();

	private static final int MAXN = (int) 1e3 + 1;
	private static int[] father = new int[MAXN];
	private static int[] size = new int[MAXN];
	private static int setSize;

	private static int[] stack = new int[MAXN];

	private static void build(int n) {
		rowFirstMap.clear();
		colFirstMap.clear();
		for (int i = 0; i < n; i++) {
			father[i] = i;
			size[i] = 1;
		}
		setSize = n;
	}

	public int removeStones(int[][] stones) {
		int n = stones.length;
		build(n);

		for (int i = 0; i < stones.length; i++) {
			int row = stones[i][0];
			int col = stones[i][1];
			if (!rowFirstMap.containsKey(row)) {
				rowFirstMap.put(row, i);
			} else {
				union(rowFirstMap.get(row), i);
			}
			if (!colFirstMap.containsKey(col)) {
				colFirstMap.put(col, i);
			} else {
				union(colFirstMap.get(col), i);
			}
		}

		return n - setSize;
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

	private static void union(int x, int y) {
		int fx = find(x);
		int fy = find(y);
		if (fx == fy) {
			return;
		}

		if (size[fx] > size[fy]) {
			father[fy] = fx;
			size[fx] += size[fy];
		} else {
			father[fx] = fy;
			size[fy] += size[fx];
		}

		setSize--;
	}

}
