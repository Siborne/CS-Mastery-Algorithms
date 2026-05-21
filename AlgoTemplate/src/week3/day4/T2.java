package week3.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.PriorityQueue;

public class T2 {

	private static class Task {
		int end;
		int comp;
		int d;

		Task(int end, int comp, int d) {
			this.end = end;
			this.comp = comp;
			this.d = d;
		}
	}

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int m = (int) st.nval;

			int[] rest = new int[n + 1];
			for (int i = 1; i <= n; i++) {
				st.nextToken();
				rest[i] = (int) st.nval;
			}

			PriorityQueue<Task> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.end, b.end));

			for (int i = 0; i < m; i++) {
				st.nextToken();
				int a = (int) st.nval;
				st.nextToken();
				int b = (int) st.nval;
				st.nextToken();
				int c = (int) st.nval;
				st.nextToken();
				int d = (int) st.nval;

				while (!pq.isEmpty() && pq.peek().end <= a) {
					Task cur = pq.poll();
					rest[cur.comp] += cur.d;
				}

				if (rest[b] < d) {
					writer.println(-1);
				} else {
					rest[b] -= d;
					writer.println(rest[b]);
					pq.offer(new Task(a + c, b, d));
				}
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
