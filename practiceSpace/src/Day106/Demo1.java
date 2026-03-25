package Day106;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Demo1 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static class Node {
		private int v;
		private int s;

		private Node(int v, int s) {
			this.v = v;
			this.s = s;
		}
	}

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;

			Node[] w = new Node[n + 1];
			for (int i = 1; i < w.length; i++) {
				st.nextToken();
				int v = (int) st.nval;
				st.nextToken();
				int s = (int) st.nval;
				w[i] = new Node(v, s);
			}

			Arrays.sort(w, 1, n + 1, (o1, o2) -> Integer.compare(o2.s, o1.s));

			PriorityQueue<Integer> queue = new PriorityQueue<>();
			long sum = 0;
			long ans = 0;
			int pos = 1;
			int count = n;

			while (count > 0) {
				while (pos <= n && w[pos].s == count) {
					queue.offer(w[pos].v);
					sum += w[pos].v;
					pos++;
				}

				while (queue.size() > count) {
					sum -= queue.poll();
				}

				ans = Math.max(ans, sum);
				count--;
			}

			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
