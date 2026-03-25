package Day42;

import java.util.Scanner;

public class Demo8 {

	private static Scanner reader = new Scanner(System.in);
	private static int N;
	private static char[][] grid;
	private static int[][] flag;
	private static int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

	private static int circleCount = 0;
	private static int ans = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N = reader.nextInt();
		grid = new char[N][N];
		flag = new int[N][N];
		reader.nextLine();

		for (int i = 0; i < grid.length; i++) {
			grid[i] = reader.nextLine().toCharArray();
		}

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if(grid[i][j] == '#' && flag[i][j] == 0) {
					circleCount = 0;
					dfs(i, j);
					if (circleCount == 0) {
						ans++;
					}
				}
			}
		}

		System.out.println(ans);
	}

	private static void dfs(int i, int j) {
		flag[i][j] = 1;

		if (fun(i, j)) {
			circleCount++;
		}

		for (int k = 0; k < dir.length; k++) {
			int dx = i + dir[k][0];
			int dy = j + dir[k][1];
			if (grid[dx][dy] == '#' && flag[dx][dy] == 0) {
				dfs(dx, dy);
			}
		}
	}

	private static boolean fun(int i,int j) {
		
		for(int k=0;k<dir.length;k++) {
			int dx = i + dir[k][0];
			int dy = j + dir[k][1];
			
			if(grid[dx][dy]=='.') {
				return false;
			}
			
		}
		
		return true;
	}
	
}
