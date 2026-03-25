package Day40;

import java.util.Scanner;

public class Demo2 {
	private static int ans;
	private static boolean[][] grid;
	private static int n;
	private static int m;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		n = reader.nextInt();
		m = reader.nextInt();
		grid = new boolean[n][m];
		dfs(0, 0);
		System.out.println(ans);
		reader.close();
	}

	private static void dfs(int x, int y) {
		if (x == n) {
			ans++;
			return;
		}

		if ((x < 2 || !grid[x - 1][y] || !grid[x - 2][y]) &&
			(y < 2 || !grid[x][y - 1] || !grid[x][y - 2])) {
			grid[x][y] = true;
			if (y < m - 1) {
				dfs(x, y + 1);
			} else {
				dfs(x + 1, 0);
			}
			grid[x][y] = false;
		}

//		if ((x < 2 || grid[x - 1][y] || grid[x - 2][y]) &&
//			(y < 2 || grid[x][y - 1] || grid[x][y - 2])) {
			if (y < m - 1) {
				dfs(x, y + 1);
			} else {
				dfs(x + 1, 0);
			}
//		}

	}

}
