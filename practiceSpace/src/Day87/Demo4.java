package Day87;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			long d = reader.nextLong();
			Point[] points = new Point[n];
			for (int i = 0; i < n; i++) {
				long x = reader.nextLong();
				long y = reader.nextLong();
				points[i] = new Point(x, y);
			}

			if (isBipartite(points, n, d)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}

		reader.close();
	}

	private static class Point {
		long x;
		long y;

		Point(long x, long y) {
			this.x = x;
			this.y = y;
		}
	}

	private static boolean isBipartite(Point[] points, int n, long d) {
		// TODO Auto-generated method stub
		List<List<Integer>> graph = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			graph.add(new ArrayList<>());
		}

		long dSquared = d * d;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				long distSquared = getDistancecSquared(points[i], points[j]);
				if (distSquared <= dSquared) {
					graph.get(i).add(j);
					graph.get(j).add(i);
				}
			}
		}

		int[] color = new int[n];
//		Arrays.fill(color, 0);

		for (int i = 0; i < n; i++) {
			if (color[i] == 0) {
				if (!dfs(graph, i, 1, color)) {
					return false;
				}
			}
		}

		return true;
	}

	private static long getDistancecSquared(Point p1, Point p2) {
		// TODO Auto-generated method stub
		long dx = p1.x - p2.x;
		long dy = p1.y - p2.y;
		return dx * dx + dy * dy;
	}

	private static boolean dfs(List<List<Integer>> graph, int node, int c, int[] color) {
		color[node] = c;
		for (int neighbor : graph.get(node)) {
			if (color[neighbor] == c) {
				return false;
			}
			if (color[neighbor] == 0) {
				if (!dfs(graph, neighbor, 3 - c, color)) {
					return false;
				}
			}
		}
		return true;
	}

}
