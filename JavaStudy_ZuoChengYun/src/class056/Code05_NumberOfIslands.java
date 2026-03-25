package class056;

public class Code05_NumberOfIslands {

	private static int MAXN = (int) 1e5 + 1;

	private static int[] father = new int[MAXN];
	private static int[] size = new int[MAXN];
	private static int[] stack = new int[MAXN];

	private static int cols;
	private static int setSize;

	public int numIslands(char[][] grid) {
		int n = grid.length;
		int m = grid[0].length;
		build(n, m, grid);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (grid[i][j] == '1') {
					if (j > 0 && grid[i][j - 1] == '1') {
						union(i, j, i, j - 1);
					}
					if (i > 0 && grid[i - 1][j] == '1') {
						union(i, j, i - 1, j);
					}
				}
			}
		}
		return setSize;
	}

	private static void build(int n, int m, char[][] grid) {
		cols = m;
		setSize = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0, index; j < m; j++) {
				if (grid[i][j] == '1') {
					index = index(i, j);
					father[index] = index;
					setSize++;
				}
			}
		}
	}

	private static int index(int a, int b) {
		return a * cols + b;
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

	private static void union(int a, int b, int c, int d) {
		int fx = find(index(a, b));
		int fy = find(index(c, d));
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
