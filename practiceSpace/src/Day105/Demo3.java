package Day105;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.PriorityQueue;

public class Demo3 {

	private static BufferedReader reader;
	private static StreamTokenizer st;
	private static PrintWriter writer;
	private static PriorityQueue<Integer> queue;

	static {
		reader = new BufferedReader(new InputStreamReader(System.in));
		st = new StreamTokenizer(reader);
		writer = new PrintWriter(new OutputStreamWriter(System.out));
		queue = new PriorityQueue<>((o1, o2) -> Integer.compare(o1, o2));
	}

	private static int T, ans, N;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			T = (int) st.nval;
			while (T-- > 0) {
				queue.clear();
				ans = 0;
				st.nextToken();
				N = (int) st.nval;
				while (N-- > 0) {
					st.nextToken();
					int x = (int) st.nval;
					queue.add(x);
				}
				int count = 2;
				while (!queue.isEmpty() && count-- > 0) {
					ans += queue.poll();
				}
				writer.println(ans);
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
