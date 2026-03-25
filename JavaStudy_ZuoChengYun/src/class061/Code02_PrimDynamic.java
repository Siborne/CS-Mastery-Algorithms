package class061;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Code02_PrimDynamic {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			List<ArrayList<int[]>> graph = new ArrayList<>();
			int n = (int) st.nval;
			for (int i = 0; i <= n; i++) {
				graph.add(new ArrayList<>());
			}
			st.nextToken();
			int m = (int) st.nval;
			for (int i = 0, u, v, w; i < m; i++) {
				st.nextToken();
				u = (int) st.nval;
				st.nextToken();
				v = (int) st.nval;
				st.nextToken();
				w = (int) st.nval;
				graph.get(u).add(new int[] { v, w });
				graph.get(v).add(new int[] { u, w });
			}
			PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
			for (int[] edge : graph.get(1)) {
				heap.add(edge);
			}
			boolean[] set = new boolean[n + 1];
			int nodeCnt = 1;
			set[1] = true;
			int ans = 0;
			while (!heap.isEmpty()) {
				int[] edge = heap.poll();
				int next = edge[0];
				int cost = edge[1];
				if (!set[next]) {
					nodeCnt++;
					set[next] = true;
					ans += cost;
					for (int[] e : graph.get(next)) {
						heap.add(e);
					}
				}
			}
			writer.println(nodeCnt == n ? ans : "orz");
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
