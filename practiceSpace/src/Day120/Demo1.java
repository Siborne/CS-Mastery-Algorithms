package Day120;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int[][] grid = new int[n+1][n+1];
		grid[1][1] = 1;
		for (int i = 2; i < grid.length; i++) {
			grid[1][i] = grid[1][i-1]+grid[0][i-1];
		}
		
		for (int i = 2; i < grid.length; i++) {
			for (int j = 1; j < grid.length; j++) {
				grid[i][j] = grid[i-1][j] + grid[i][j-1];
			}
		}
		
		System.out.println(grid[n][n]);
		
		reader.close();
	}
	
}
