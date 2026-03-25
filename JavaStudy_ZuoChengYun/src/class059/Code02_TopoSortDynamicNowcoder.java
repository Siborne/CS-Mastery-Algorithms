package class059;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Arrays;

public class Code02_TopoSortDynamicNowcoder {

	private static final int MAXN = (int) 2e5 + 1;

	private static int[] queue = new int[MAXN];

	private static int l, r;

	private static int[] indegree = new int[MAXN];

	private static int[] ans = new int[MAXN];

	private static int n, m;

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			m = (int) st.nval;
			ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
			for (int i = 0; i <= n; i++) {
				graph.add(new ArrayList<>());
			}
			Arrays.fill(indegree, 0, n + 1, 0);
			for (int i = 0, from, to; i < m; i++) {
				st.nextToken();
				from = (int) st.nval;
				st.nextToken();
				to = (int) st.nval;
				graph.get(from).add(to);
				indegree[to]++;
			}
			if (!topoSort(graph)) {
				writer.println(-1);
			} else {
				for (int i = 0; i < n - 1; i++) {
					writer.print(ans[i] + " ");
				}
				writer.println(ans[n - 1]);
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static boolean topoSort(ArrayList<ArrayList<Integer>> graph) {
		l = r = 0;
		for (int i = 1; i <= n; i++) {
			if (indegree[i] == 0) {
				queue[r++] = i;
			}
		}
		int fill = 0;
		while (l < r) {
			int cur = queue[l++];
			ans[fill++] = cur;
			for (int next : graph.get(cur)) {
				if (--indegree[next] == 0) {
					queue[r++] = next;
				}
			}
		}
		return fill == n;
	}

}
