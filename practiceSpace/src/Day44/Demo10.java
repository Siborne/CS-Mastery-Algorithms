package Day44;

public class Demo10 {
	private static final int N = 5;
	private static final int[][] look = { { 2, 2, 3, 2, 1 }, { 3, 3, 1, 2, 4 }, { 2, 2, 1, 3, 3 }, { 1, 4, 2, 2, 3 } };
	private static int[][] map = new int[N][N];
	private static int[][] rowUsed = new int[N][N + 1];
	private static int[][] colUsed = new int[N][N + 1];

	public static void main(String[] args) {
		dfs(0, 0);
	}

	static void dfs(int x, int y) {
		if (y == N) {
			dfs(x + 1, 0);
			return;
		}
		if (x == N) {
			if (check(0, 1) && check(0, -1) && check(1, 1) && check(1, -1)) {
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < N; j++) {
						System.out.print(map[i][j]);
					}
				}
				System.exit(0);
			}
			return;
		}
		for (int i = 1; i <= N; i++) {
			if (rowUsed[x][i] == 0 && colUsed[y][i] == 0) {
				map[x][y] = i;
				rowUsed[x][i] = 1;
				colUsed[y][i] = 1;
				dfs(x, y + 1);
				map[x][y] = 0;
				rowUsed[x][i] = 0;
				colUsed[y][i] = 0;
			}
		}
	}

	private static boolean check(int rowOrcol, int step) {
		if (rowOrcol == 0) {
			for (int x = 0; x < N; x++) {
				int y = step == 1 ? 0 : N - 1;
				int last = map[x][y];
				int cnt = 1;
				while (0 <= y && y < N) {
					if (map[x][y] > last) {
						cnt++;
					}
					last = Math.max(last, map[x][y]);
					y += step;
				}
				if (cnt != look[step == 1 ? 0 : 1][x]) {
					return false;
				}
			}
			return true;
		} else {
			for (int y = 0; y < N; y++) {
				int x = step == 1 ? 0 : N - 1;
				int last = map[x][y];
				int cnt = 1;
				while (0 <= x && x < N) {
					if (map[x][y] > last) {
						cnt++;
					}
					last = Math.max(last, map[x][y]);
					x += step;
				}
				if (cnt != look[step == 1 ? 2 : 3][y]) {
					return false;
				}
			}

			return true;
		}
	}
}
