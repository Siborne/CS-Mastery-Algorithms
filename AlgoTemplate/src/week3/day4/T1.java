package week3.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Iterator;
import java.util.PriorityQueue;

public class T1 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			for (int i = 0; i < n; i++) {
				st.nextToken();
				pq.add((int) st.nval);
			}
			long ans = 0;
			for (int i = 0; i < n - 1; i++) {
				int a = pq.poll();
				int b = pq.poll();
				ans += a + b;
				pq.add(a + b);
			}
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
