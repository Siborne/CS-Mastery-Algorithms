package Day101;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo2 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static int N, M, T, SX, SY, FX, FY;
	private static boolean[][] map;
	private static boolean[][] temp;
	private static long ans;

	public static void main(String[] args) throws IOException {
		st.nextToken();
		N = (int) st.nval;
		st.nextToken();
		M = (int) st.nval;
		st.nextToken();
		T = (int) st.nval;

		map = new boolean[N][M];
		temp = new boolean[N][M];
		st.nextToken();
		SX = (int) st.nval - 1;
		st.nextToken();
		SY = (int) st.nval - 1;
		st.nextToken();
		FX = (int) st.nval - 1;
		st.nextToken();
		FY = (int) st.nval - 1;

		for (int i = 0; i < T; i++) {
			st.nextToken();
			int x = (int) st.nval - 1;
			st.nextToken();
			int y = (int) st.nval - 1;
			map[x][y] = true;
		}
		ans = 0;
		temp[SX][SY] = true;
		dfs(SX, SY);
		writer.println(ans);
		writer.flush();
		writer.close();
		reader.close();
	}

	private static int[][] fx = new int[][] { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

	private static void dfs(int x, int y) {
		if (x == FX && y == FY) {
			ans++;
			return;
		}

		for (int i = 0; i < 4; i++) {
			int newX = x + fx[i][0];
			int newY = y + fx[i][1];
			if (newX >= 0 && newY >= 0 && newX < N && newY < M && !temp[newX][newY] && !map[newX][newY]) {
				temp[newX][newY] = true;
				dfs(newX, newY);
				temp[newX][newY] = false;
			}
		}

	}

}
