package g2025;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class T3 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static StringTokenizer st;
	private static int n, m, q, x, y;
	private static long ans;

	private static char[][] map;
	private static int[][] map2;
	private static String s;
	private static boolean[][] map3;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(reader.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		q = Integer.parseInt(st.nextToken());
		map = new char[n][m];
		map2 = new int[n][m];

		for (int i = 0; i < n; i++) {
			s = reader.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = s.charAt(j);
				if (map[i][j] == '#') {
					map2[i][j] = 1;
				} else {
					if (i >= 1 && j >= 1) {
						map2[i][j] = (map2[i - 1][j] + map2[i][j - 1]) == 2 ? 1 : 0;
					}
				}
			}
		}

		/*
		 * for (int[] arr : map2) { for (int a : arr) { System.out.print(a + " "); }
		 * System.out.println(); }
		 */

		while (q-- > 0) {
			st = new StringTokenizer(reader.readLine());
			x = Integer.parseInt(st.nextToken()) - 1;
			y = Integer.parseInt(st.nextToken()) - 1;
			map[x][y] = '.';
			map2[x][y] = 0;
			Deque<Node> queue = new LinkedList<>();
			map3 = new boolean[n][m];
			ans = 0L;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (map2[i][j] != 1 && map[i][j] == '.' && !map3[i][j]) {
						queue.add(new Node(i, j));
						map3[i][j] = true;
						while (!queue.isEmpty()) {
							Node e = queue.pollFirst();
							ans++;
//							System.out.println(ans);
							for (int k = 0; k < 4; k++) {
								int newX = e.x + fx[k][0];
								int newY = e.y + fx[k][1];
								if (newX >= 0 && newY >= 0 && newX < n && newY < m && !map3[newX][newY]
										&& map[newX][newY] == '.') {
									map3[newX][newY] = true;
									queue.add(new Node(newX, newY));
									/*
									 * System.out.println("e.x:" + e.x + ",e.y:" + e.y); System.out.println("newX:"
									 * + newX + ",newY:" + newY);
									 */
								}
							}
						}
					}
				}
			}
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static int[][] fx = new int[][] { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

	private static class Node {
		private int x;
		private int y;

		private Node(int x, int y) {
			this.x = x;
			this.y = y;
		}

	}

}
