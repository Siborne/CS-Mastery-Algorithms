package Day39;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Demo1 {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(reader.readLine());
		char[][] grid = new char[n][n];
		boolean flag = false;
		int Ax = 0;
		int Ay = 0;
		for (int i = 0; i < n; i++) {
			grid[i] = reader.readLine().replace(" ", "").toCharArray();
			if (!flag) {
				for (int j = 0; j < n; ++j) {
					if (grid[i][j] == 'A') {
						Ax = i;
						Ay = j;
						flag = true;
						break;
					}
				}
			}
		}
		bfs(grid, Ax, Ay,n);

		reader.close();
		writer.close();
	}

	private static void bfs(char[][] grid, int Ax, int Ay,int n) {
		int ans = -1;

		Queue<Node> queue = new LinkedList<>();
		queue.add(new Node('+', Ax, Ay, 0));
		queue.add(new Node('-', Ax, Ay, 0));
		grid[Ax][Ay] = 'S';
		while (!queue.isEmpty()) {
			Node pop = queue.poll();
			if (pop.c == 'B') {
				ans = pop.step;
				break;
			}
			for (int i = 0; i < 4; i++) {
				int x = pop.x + dicts[i][0];
				int y = pop.y + dicts[i][1];
				if(x>=0&&y>=0&&x<n&&y<n&&grid[x][y]!='S'&&pop.c!=grid[x][y]) {
					queue.offer(new Node(grid[x][y],x,y,pop.step+1));
					grid[x][y] = 'S';
				}
			}
		}

		writer.println(ans);
		writer.flush();
	}

	private static final int[][] dicts = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

	private static class Node {
		int x;
		int y;
		int step;
		char c;

		public Node(char c, int x, int y, int step) {
			this.c = c;
			this.x = x;
			this.y = y;
			this.step = step;
		}
	}

}
