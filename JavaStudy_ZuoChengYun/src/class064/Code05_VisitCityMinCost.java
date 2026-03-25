package class064;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Code05_VisitCityMinCost {

	public int electricCarPlan(int[][] paths, int cnt, int start, int end, int[] charge) {
		int n = charge.length;
		ArrayList<ArrayList<int[]>> graph = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			graph.add(new ArrayList<>());
		}
		for (int[] path : paths) {
			graph.get(path[0]).add(new int[] { path[1], path[2] });
			graph.get(path[1]).add(new int[] { path[0], path[2] });
		}
		int[][] distance = new int[n][cnt + 1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= cnt; j++) {
				distance[i][j] = Integer.MAX_VALUE;
			}
		}
		distance[start][0] = 0;
		boolean[][] visited = new boolean[n][cnt + 1];
		PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> (a[2] - b[2]));
		heap.add(new int[] { start, 0, 0 });
		while (!heap.isEmpty()) {
			int[] record = heap.poll();
			int cur = record[0];
			int power = record[1];
			int cost = record[2];
			if (visited[cur][power]) {
				continue;
			}
			if (cur == end) {
				return cost;
			}
			visited[cur][power] = true;
			if (power < cnt) {
				if (!visited[cur][power + 1] && cost + charge[cur] < distance[cur][power + 1]) {
					distance[cur][power + 1] = cost + charge[cur];
					heap.add(new int[] { cur, power + 1, cost + charge[cur] });
				}
			}
			for (int[] edge : graph.get(cur)) {
				int nextCity = edge[0];
				int restPower = power - edge[1];
				int nextCost = cost + edge[1];
				if (restPower >= 0 && !visited[nextCity][restPower] && nextCost < distance[nextCity][restPower]) {
					distance[nextCity][restPower] = nextCost;
					heap.add(new int[] { nextCity, restPower, nextCost });
				}
			}
		}
		return -1;
	}

}
