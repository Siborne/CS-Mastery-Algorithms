package Day41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo8 {

	public static void main(String[] args) {
		List<Integer>[] graph = new ArrayList[7];
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<>();
		}
		graph[0].addAll(Arrays.asList(1, 5));
		graph[1].addAll(Arrays.asList(0, 2, 6));
		graph[2].addAll(Arrays.asList(1, 3, 6));
		graph[3].addAll(Arrays.asList(2, 4));
		graph[4].addAll(Arrays.asList(3, 5, 6));
		graph[5].addAll(Arrays.asList(0, 4, 6));
		graph[6].addAll(Arrays.asList(1, 2, 4, 5));

		long ans = 0;

		for (int i = (1 << 7) - 1; i >= 1; i--) {
			if (isValid(graph, i)) {
				ans++;
			}
		}

		System.out.println(ans);
	}

	private static boolean isValid(List<Integer>[] graph, int state) {
		for (int i = 0; i < graph.length; i++) {
			if ((state & 1 << i) != 0) {
				int[] visited = new int[1];
				dfs(graph, i, visited, state);

				return visited[0] == state;
			}
		}

		return false;
	}

	private static void dfs(List<Integer>[] graph, int i, int[] visited, int state) {
		if ((visited[0] & 1 << i) != 0 || (state & 1 << i) == 0) {
			return;
		}

		visited[0] |= 1 << i;
		for (int next : graph[i]) {
			dfs(graph, next, visited, state);
		}

	}

}
