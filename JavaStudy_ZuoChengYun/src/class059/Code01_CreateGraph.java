package class059;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code01_CreateGraph {

	private static int MAXN = 11;

	private static int MAXM = 21;

	private static int[][] graph1 = new int[MAXN][MAXN];

	private static List<List<int[]>> graph2 = new ArrayList<>();

	private static int[] head = new int[MAXN];
	private static int[] next = new int[MAXM];
	private static int[] to = new int[MAXM];

	private static int[] weight = new int[MAXM];

	private static int cnt;

	private static void build(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				graph1[i][j] = 0;
			}
		}
		graph2.clear();
		for (int i = 0; i <= n; i++) {
			graph2.add(new ArrayList<>());
		}

		cnt = 1;
		Arrays.fill(head, 1, n + 1, 0);
	}

	private static void addEdge(int u, int v, int w) {
		// u -> v
		next[cnt] = head[u];
		to[cnt] = v;
		weight[cnt] = w;
		head[u] = cnt++;
	}

	private static void directGraph(int[][] edges) {
		for (int[] edge : edges) {
			graph1[edge[0]][edge[1]] = edge[2];
		}

		for (int[] edge : edges) {
			graph2.get(edge[0]).add(new int[] { edge[1], edge[2] });
		}

		for (int[] edge : edges) {
			addEdge(edge[0], edge[1], edge[2]);
		}

	}

	private static void undirectGraph(int[][] edges) {
		for (int[] edge : edges) {
			graph1[edge[0]][edge[1]] = edge[2];
			graph1[edge[1]][edge[0]] = edge[2];
		}

		for (int[] edge : edges) {
			graph2.get(edge[0]).add(new int[] { edge[1], edge[2] });
			graph2.get(edge[1]).add(new int[] { edge[0], edge[2] });
		}

		for (int[] edge : edges) {
			addEdge(edge[0], edge[1], edge[2]);
			addEdge(edge[1], edge[0], edge[2]);
		}

	}

	private static void travelsal(int n) {
		System.out.println("领接矩阵遍历：");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(graph1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("领接表遍历：");
		for (int i = 1; i <= n; i++) {
			System.out.println(i + "(邻居、边权)：");
			for (int[] edge : graph2.get(i)) {
				System.out.print("(" + edge[0] + "," + edge[1] + ") ");
			}
			System.out.println();
		}

		System.out.println("链式前向星：");
		for (int i = 1; i <= n; i++) {
			System.out.println(i + "(邻居、边权)：");
			for (int ei = head[i]; ei > 0; ei = next[ei]) {
				System.out.print("(" + to[ei] + "," + weight[ei] + ")");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n1 = 4;
		int[][] edges1 = {
				{1,3,6},
				{4,3,4},
				{2,4,2},
				{1,2,7},
				{2,3,5},
				{3,1,1}
		};
		build(n1);
		directGraph(edges1);
		travelsal(n1);
		System.out.println("=================");
		int n2 = 5;
		int[][] edges2 = {
				{3,5,4},
				{4,1,1},
				{3,4,2},
				{5,2,4},
				{2,3,7},
				{1,5,5},
				{4,2,6}
		};
		build(n2);
		undirectGraph(edges2);
		travelsal(n2);
	}

}
