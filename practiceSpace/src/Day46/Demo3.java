package Day46;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Demo3 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
	private static int n;
	private static char[][] chs;
	private static boolean[][] visited;
	private static char[] target = "yizhong".toCharArray();
	private static int[][] coords = new int[10000][2];
	private static int index = 0;
	private static int[][] dict = { { 0, 0 }, { -1, 0 }, { 0, 1 }, { -1, 1 }, { 1, 0 }, { 0, -1 }, { 1, -1 },
			{ -1, -1 }, { 1, 1 } };

	public static void main(String[] args) throws IOException {
		n = Integer.parseInt(reader.readLine());

		chs = new char[n][n];
		visited = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			char[] c = reader.readLine().toCharArray();
			for (int j = 0; j < n; j++) {
				chs[i][j] = c[j];
				if (chs[i][j] == 'y') {
					coords[index][0] = i;
					coords[index++][1] = j;
				}
			}
		}

		for (int idx = 0; idx < index; idx++) {
			int x = coords[idx][0];
			int y = coords[idx][1];

			// 尝试 8 个方向
			for (int i = 1; i <= 8; i++) {
				int newX = x + dict[i][0];
				int newY = y + dict[i][1];

				// ❗错误点 2：边界判断错误
				if (newX >= 0 && newY >= 0 && newX < n && newY < n) {
					
					// ❗错误点 3：提前判断 chs[newX][newY] == 'i' 可能漏解
					// ✅ 可以去掉该条件，让 dfs 统一处理
					if (dfs(newX, newY, dict[i][0], dict[i][1], 2)) {
						visited[x][y] = true; // ✅ 标记起点 'y'
					}
				}
			}
		}

		for (int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < n; j++) {
				if (visited[i][j]) {
					sb.append(chs[i][j]);
				} else {
					sb.append("*");
				}
			}
			writer.println(sb.toString());
		}

		writer.flush();
		writer.close();
		reader.close();
	}

	private static boolean dfs(int x, int y, int mx, int my, int next) {
		if (next >= target.length) {
			visited[x][y] = true;
			return true;
		}

		int nx = x + mx;
		int ny = y + my;

		if (nx < 0 || ny < 0 || nx >= n || ny >= n) {
			return false;
		}

		if (chs[nx][ny] == target[next]) {
			if (dfs(nx, ny, mx, my, next + 1)) {
				visited[x][y] = true;
				return true;
			}
		}

		return false;
	}

}
