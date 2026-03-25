package Day101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Demo3 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static int n, m, x, y;

	private static int[][] fx = new int[][] { { 2, 1 }, { -2, -1 }, { -2, 1 }, { 2, -1 }, { 1, 2 }, { -1, -2 },
			{ -1, 2 }, { 1, -2 } };

	public static void main(String[] args) throws IOException {
		st.nextToken();
		n = (int) st.nval;
		st.nextToken();
		m = (int) st.nval;
		st.nextToken();
		x = (int) st.nval - 1;
		st.nextToken();
		y = (int) st.nval - 1;
		int[][] map = new int[n][m];
		for (int i = 0; i < n; i++) {
			Arrays.fill(map[i], -1);
		}
		Deque<Node> queue = new LinkedList<>();
		map[x][y] = 0;
		queue.add(new Node(x, y));

		while (!queue.isEmpty()) {

			Node e = queue.pollFirst();
			int curStep = map[e.x][e.y];
			for (int i = 0; i < fx.length; i++) {
				int newX = e.x + fx[i][0];
				int newY = e.y + fx[i][1];
				if (newX >= 0 && newY >= 0 && newX < n && newY < m && map[newX][newY] == -1) {
					map[newX][newY] = curStep + 1;
					queue.add(new Node(newX, newY));
				}
			}

		}

		for (int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < m; j++) {
				if (j > 0) {
					sb.append(" ");
				}
				sb.append(map[i][j]);
			}
			System.out.println(sb.toString());
		}

		writer.flush();
		writer.close();
		reader.close();
	}

	private static class Node {
		private int x;
		private int y;

		private Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}
