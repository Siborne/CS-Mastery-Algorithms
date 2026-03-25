package Day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Demo6 {
	public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	public static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(reader.readLine());
		int a = Integer.parseInt(st.nextToken()) - 1;
		int b = Integer.parseInt(st.nextToken()) - 1;
		int c = Integer.parseInt(st.nextToken()) - 1;
		int d = Integer.parseInt(st.nextToken()) - 1;

		int[][] grid = new int[n][m];
		int[][] dp = new int[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());
			for (int j = 0; j < m; j++) {
				grid[i][j] = Integer.parseInt(st.nextToken());
				dp[i][j] = -1;
			}
		}
		dfs(a, b, grid, 1, dp,n,m,k);

		if (dp[c][d] == 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static int[][] dicts = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

	public static void dfs(int x, int y, int[][] grid, int flag, int[][] dp,int n,int m,int k) {
		dp[x][y] = 1;
		for (int i = 0; i < dicts.length; i++) {
			int newX = x + dicts[i][0];
			int newY = y + dicts[i][1];
			if(newX<0||newY<0||newX>=n||newY>=m||dp[newX][newY]==1) {
				continue;
			}
			if(grid[x][y]>=grid[newX][newY]) {
				dfs(newX,newY,grid,flag,dp,n,m,k);
			}else {
				if(flag==1&&k+grid[x][y]>=grid[newX][newY]) {
					dfs(newX,newY,grid,0,dp,n,m,k);
				}
			}
		}
	}
}
