package Day44;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[][] arr = new int[n][n];
		boolean[][] visited = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = reader.nextInt();
			}
		}
		bfs(arr, visited, n);
		reader.close();
	}

	private static void bfs(int[][] arr, boolean[][] visited, int n) {
		Queue<Node> queue = new LinkedList<>();
		queue.offer(new Node(0, 0, 0));
		visited[0][0] = true;
		while (!queue.isEmpty()) {
			Node node = queue.poll();
			int x = node.x;
			int y = node.y;
			int time = node.time;
			if (x == n - 1 && y == n - 1) {
				System.out.println(time);
				return;
			}
			if (x + 1 < n && !visited[x + 1][y]) {
				visited[x + 1][y] = true;
				queue.offer(new Node(x + 1, y, time + 1));
			}
			if (y + 1 < n && !visited[x][y + 1]) {
				visited[x][y + 1] = true;
				queue.offer(new Node(x, y + 1, time + 1));
			}
			
			
			int height = arr[x][y];
			for (int i = y + 1; i < n; i++) {
				if (height > arr[x][i]) {
					height = arr[x][i];
					if(!visited[x][i]) {
						visited[x][i] = true;
						queue.offer(new Node(x, i, time + 1));
						
					}
				}else {
					break;
				}
			}
			height = arr[x][y];
			for (int i = y-1; i >= 0; i--) {
				if (height > arr[x][i] ) {
					height = arr[x][i];
					if(!visited[x][i]) {
						visited[x][i] = true;
						queue.offer(new Node(x, i, time + 1));
					}
				}else {
					break;
				}
			}
		}
	}

	private static class Node {
		int x;
		int y;
		int time;

		private Node(int x, int y, int time) {
			this.x = x;
			this.y = y;
			this.time = time;
		}
	}
}
