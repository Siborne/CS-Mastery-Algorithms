package week1.day6;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T7 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int[][] grid = new int[15][10];

			grid[0][0] = (int) st.nval;

			for (int j = 1; j < 10; j++) {
				st.nextToken();
				grid[0][j] = (int) st.nval;
			}

			for (int i = 1; i < 15; i++) {
				for (int j = 0; j < 10; j++) {
					st.nextToken();
					grid[i][j] = (int) st.nval;
				}
			}

			int[][] piece = new int[4][4];
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					st.nextToken();
					piece[i][j] = (int) st.nval;
				}
			}

			st.nextToken();
			int startCol = (int) st.nval;
			int col = startCol - 1;

			int finalRow = -1;
			for (int row = 0; row <= 15; row++) {
				if (!canPlace(grid, piece, row, col)) {
					finalRow = row - 1;
					break;
				}
			}

			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (piece[i][j] == 1) {
						int gridRow = finalRow + i;
						int gridCol = col + j;
						if (gridRow >= 0 && gridRow < 15 && gridCol >= 0 && gridCol < 10) {
							grid[gridRow][gridCol] = 1;
						}
					}
				}
			}

			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 10; j++) {
					writer.print(grid[i][j] + (j == 9 ? "" : " "));
				}
				writer.println();
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static boolean canPlace(int[][] grid, int[][] piece, int row, int col) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (piece[i][j] == 1) {
					int gridRow = row + i;
					int gridCol = col + j;
					if (gridRow >= 15)
						return false;
					if (gridCol < 0 || gridCol >= 10)
						return false;
					if (gridRow >= 0 && grid[gridRow][gridCol] == 1)
						return false;
				}
			}
		}
		return true;
	}
}