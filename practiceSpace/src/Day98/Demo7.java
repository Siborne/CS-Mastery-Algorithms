package Day98;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Demo7 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static int n, m, u, v, node1Index, node2Index;
	private static List<List<Integer>> nodes;
	private static Deque<Integer> queue;

	private static List<Integer> node1, node2;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			m = (int) st.nval;

			nodes = new ArrayList<>();
			for (int i = 0; i <= n; i++) {
				nodes.add(new ArrayList<>());
			}

			for (int i = 0; i < m; i++) {
				st.nextToken();
				u = (int) st.nval;
				st.nextToken();
				v = (int) st.nval;
				nodes.get(u).add(v);
				nodes.get(v).add(u);
			}

			queue = new LinkedList<>();

			for (int i = 1; i <= n; i++) {
				if (nodes.get(i).size() == 1) {
					queue.add(i);
				}
			}

			while (!queue.isEmpty()) {
				node1Index = queue.pollFirst();
				node1 = nodes.get(node1Index);
				node2Index = node1.get(0);
				node1.clear();
				node2 = nodes.get(node2Index);
				for (int i = 0; i < node2.size(); i++) {
					if (node2.get(i) == node1Index) {
						node2.remove(i);
						break;
					}
				}

				if (node2.size() == 1) {
					queue.offer(node2Index);
				}
			}
			for (int i = n; i >= 1; i--) {
				if (nodes.get(i).size() > 1) {
					System.out.print(i + " ");
				}
			}

		}

		writer.flush();
		writer.close();
		reader.close();
	}

}
