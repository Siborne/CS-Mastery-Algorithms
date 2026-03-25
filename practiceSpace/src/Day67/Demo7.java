package Day67;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int m = reader.nextInt();

		System.out.println(bfs(n, m));
		reader.close();
	}

	private static int bfs(int n, int m) {
		Deque<Integer> queue = new LinkedList<>();
		int[] visited = new int[10001];
		Arrays.fill(visited, -1);
		queue.push(n);
		visited[n] = 0;
		while (!queue.isEmpty()) {
			int node = queue.pop();
			if (node == m) {
				return visited[node];
			}
			int newNode = node - 1;
			if (newNode >= 0 && newNode <= 10000 && visited[newNode] == -1) {
				queue.addLast(newNode);
				visited[newNode] = visited[node] + 1;
			}
			newNode = node * 2;
			if (newNode >= 0 && newNode <= 10000 && visited[newNode] == -1) {
				queue.addLast(newNode);
				visited[newNode] = visited[node] + 1;
			}
		}

		return -1;
	}

}
