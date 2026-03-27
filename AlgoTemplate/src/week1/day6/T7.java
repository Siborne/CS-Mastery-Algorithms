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

			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[0].length; j++) {
					st.nextToken();
					grid[i][j] = (int) st.nval;
				}
			}

			int[][] piece = new int[4][4];
			for (int i = 0; i < piece.length; i++) {
				for (int j = 0; j < piece[0].length; j++) {
					st.nextToken();
					piece[i][j] = (int) st.nval;
				}
			}

			st.nextToken();
			int startCol = (int) st.nval;

			int actualLeft = 0;
			while (actualLeft < 4) {
				boolean allZero = true;
				for (int i = 0; i < 4; i++) {
					if (piece[i][actualLeft] == 1) {
						allZero = false;
						break;
					}
				}
				if (!allZero) {
					break;
				}
				actualLeft++;
			}

			int pieceCol = startCol + actualLeft;

			int actualRight = 3;
			while (actualRight >= 0) {
				boolean allZero = true;
				for (int i = 0; i < 4; i++) {
					if (piece[i][actualRight] == 1) {
						allZero = false;
						break;
					}
				}
				if (!allZero) {
					break;
				}
				actualRight--;

				int finalRow = -1;
				for (int row = 0; row <= 15; row++) {
					if (!canPlace(grid, piece, row, pieceCol)) {
						finalRow = row - 1;
						break;
					}
				}

				if (finalRow == -1) {
					finalRow = 11;
				}
				
				
				
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
