package class064;

public class Code04_ShortestPathToGetAllKeys {

	private static final int MAXN = 31;
	private static final int MAXM = 31;
	private static final int MAXK = 6;

	private static final int[] move = new int[] { -1, 0, 1, 0, -1 };
	private static char[][] grid = new char[MAXN][];

	private static boolean[][][] vistied = new boolean[MAXN][MAXM][1 << MAXK];

	private static int[][] queue = new int[MAXN * MAXM * (1 << MAXK)][3];

	private static int l, r, n, m, key;

	private static void build(String[] g) {
		l = r = key = 0;
		n = g.length;
		m = g[0].length();
		for (int i = 0; i < n; i++) {
			grid[i] = g[i].toCharArray();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (grid[i][j] == '@') {
					queue[r][0] = i;
					queue[r][1] = j;
					queue[r++][2] = 0;
				}
				if (grid[i][j] >= 'a' && grid[i][j] <= 'f') {
					key |= 1 << (grid[i][j] - 'a');
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				for (int s = 0; s <= key; s++) {
					vistied[i][j][s] = false;
				}
			}
		}
	}

	public int shortestPathAllKeys(String[] g) {
		build(g);
		int level = 1;
		while (l < r) {
			for (int k = 0, size = r - l, x, y, s; k < size; k++) {
				x = queue[l][0];
				y = queue[l][1];
				s = queue[l++][2];
				for (int i = 0, nx, ny, ns; i < 4; i++) {
					nx = x + move[i];
					ny = y + move[i + 1];
					ns = s;
					if (nx < 0 || nx == n || ny < 0 || ny == m || grid[nx][ny] == '#') {
						continue;
					}
					if (grid[nx][ny] >= 'A' && grid[nx][ny] <= 'F' && ((ns & (1 << grid[nx][ny] - 'A'))) == 0) {
						continue;
					}
					if (grid[nx][ny] >= 'a' && grid[nx][ny] <= 'f') {
						ns |= (1 << grid[nx][ny] - 'a');
					}
					if (ns == key) {
						return level;
					}
					if (!vistied[nx][ny][ns]) {
						vistied[nx][ny][ns] = true;
						queue[r][0] = nx;
						queue[r][1] = ny;
						queue[r++][2] = ns;
					}
				}
			}
			level++;
		}
		return -1;
	}

}
