package Day46;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Demo2 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
	private static int n;
	private static char[][] chs;
	private static int[][] visited;
	private static char[] target = "yizhong".toCharArray();

	public static void main(String[] args) throws IOException {
		n = Integer.parseInt(reader.readLine());
		chs = new char[n][n];
		visited = new int[n][n];
		for (int i = 0; i < n; i++) {
			chs[i] = reader.readLine().toCharArray();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (chs[i][j] == 'y') {
					dfs(i, j, 0, 5);
				}
			}
		}

		for (int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < n; j++) {
				if (visited[i][j] == 1) {
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

	private static boolean dfs(int x, int y, int no, int f) {
		if (x < 0 || y < 0 || x >= n || y >= n) {
			return false;
		}

		if (chs[x][y] != target[no]) {
			return false;

		}

		if(no>=7) {
			return false;
		}
		if (chs[x][y] == target[no]) {
			if (no == target.length - 1) {
				visited[x][y] = 1;
				return true;
			} else {
				switch (f) {
				case 1:
					if (dfs(x - 1, y - 1, no + 1, 1)) {
						visited[x][y] = 1;
						return true;
					}
					return false;
				case 2:
					if (dfs(x - 1, y, no + 1, 2)) {
						visited[x][y] = 1;
						return true;
					}
					return false;
				case 3:
					if (dfs(x - 1, y + 1, no + 1, 3)) {
						visited[x][y] = 1;
						return true;
					}
					return false;
				case 4:
					if (dfs(x, y - 1, no + 1, 4)) {
						visited[x][y] = 1;
						return true;
					}
					return false;
				case 5:
					if (dfs(x - 1, y - 1, no + 1, 1)) {
						visited[x][y] = 1;
						return true;
					}
					if (dfs(x - 1, y, no + 1, 2)) {
						visited[x][y] = 1;
						return true;
					}
					if (dfs(x - 1, y + 1, no + 1, 3)) {
						visited[x][y] = 1;
						return true;
					}
					if (dfs(x, y - 1, no + 1, 4)) {
						visited[x][y] = 1;
						return true;
					}
					if (dfs(x, y + 1, no + 1, 6)) {
						visited[x][y] = 1;
						return true;
					}
					if (dfs(x + 1, y - 1, no + 1, 7)) {
						visited[x][y] = 1;
						return true;
					}
					if (dfs(x + 1, y, no + 1, 8)) {
						visited[x][y] = 1;
						return true;
					}
					if (dfs(x + 1, y + 1, no + 1, 9)) {
						visited[x][y] = 1;
						return true;
					}
					break;
				case 6:
					if (dfs(x, y + 1, no + 1, 6)) {
						visited[x][y] = 1;
						return true;
					}
					return false;
				case 7:
					if (dfs(x + 1, y - 1, no + 1, 7)) {
						visited[x][y] = 1;
						return true;
					}
					return false;
				case 8:
					if (dfs(x + 1, y, no + 1, 8)) {
						visited[x][y] = 1;
						return true;
					}
					return false;
				case 9:
					if (dfs(x + 1, y + 1, no + 1, 9)) {
						visited[x][y] = 1;
						return true;
					}
					return false;
				}

			}
		}

		return false;
	}

}
