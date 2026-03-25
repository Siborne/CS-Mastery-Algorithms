package Day42;

import java.util.Scanner;

public class Demo9 {

	private static int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		char[][] grid = new char[n][n];
		reader.nextLine();
		for (int i = 0; i < n; i++) {
			grid[i] = reader.nextLine().toCharArray();
		}
		boolean[][] flag = new boolean[n][n];
		long ans = 0L;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == '#' && !flag[i][j]) {
					int num = 0;
					num = dfs(grid, flag, i, j);
					if (num == 0) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
		reader.close();
	}

	private static int dfs(char[][] grid,boolean[][] flag,int i,int j) {
		flag[i][j] = true;
		int num = 0;
		if(fun(grid,i,j)) {
			num++;
		}
		
		for(int k = 0;k<dir.length;k++) {
			int dx = i + dir[k][0];
			int dy = j+ dir[k][1];
			if(grid[dx][dy]=='#'&&!flag[dx][dy]) {
				num+=dfs(grid,flag,dx,dy);
			}
		}
		return num;
	}

	private static boolean fun(char[][] grid, int i, int j) {
		for (int k = 0; k < dir.length; k++) {
			int dx = i + dir[k][0];
			int dy = j + dir[k][1];
			if (grid[dx][dy] == '.') {
				return false;
			}
		}
		return true;
	}

}
