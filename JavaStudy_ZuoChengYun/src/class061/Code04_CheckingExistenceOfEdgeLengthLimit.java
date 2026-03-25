package class061;

import java.util.Arrays;

public class Code04_CheckingExistenceOfEdgeLengthLimit {

	private static final int MAXN = (int) 1e5 + 1;
	private static int[][] questions = new int[MAXN][4];

	private static int[] father = new int[MAXN];
	private static int[] size = new int[MAXN];

	private static int[] stack = new int[MAXN];

	private static void build(int n) {
		for (int i = 0; i < n; i++) {
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

	private static boolean isSameSet(int x, int y) {
		return find(x) == find(y);
	}

	private static void union(int x, int y) {
		int fx = find(x);
		int fy = find(y);
		if (fx == fy) {
			return;
		}
		if (size[fx] > size[fy]) {
			size[fx] += size[fy];
			father[fy] = fx;
		} else {
			size[fy] += size[fx];
			father[fx] = fy;
		}
	}

	public boolean[] distanceLimitedPathsExist(int n, int[][] edgeList, int[][] queries) {
		Arrays.sort(edgeList, (a, b) -> a[2] - b[2]);
		int m = edgeList.length;
		int k = queries.length;
		for (int i = 0; i < k; i++) {
			questions[i][0] = queries[i][0];
			questions[i][1] = queries[i][1];
			questions[i][2] = queries[i][2];
			questions[i][3] = i;
		}
		Arrays.sort(questions, 0, k, (a, b) -> a[2] - b[2]);
		build(n);
		boolean[] ans = new boolean[k];
		for (int i = 0, j = 0; i < k; i++) {
			for (; j < m && edgeList[j][2] < questions[i][2]; j++) {
				union(edgeList[j][0], edgeList[j][1]);
			}
			ans[questions[i][3]] = isSameSet(questions[i][0], questions[i][1]);
		}
		return ans;
	}

}
