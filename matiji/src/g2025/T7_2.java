package g2025;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Deque;
import java.util.LinkedList;

public class T7_2 {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static int T, n, ans, x;
	private static Deque<Integer> queue = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		st.nextToken();
		T = (int) st.nval;
		while (T-- > 0) {
			st.nextToken();
			n = (int) st.nval;
			ans = 0;
			queue.clear();
			for (int i = 0; i < n; i++) {
				st.nextToken();
				x = (int) st.nval;
				while (!queue.isEmpty() && queue.peekLast() < x) {
					int y = queue.pop();
					ans++;
					writer.println("offer:" + x + ",pop:" + y);
				}
				queue.offer(x);
			}
			for (int a : queue) {
				writer.print(a + " ");
			}
			writer.println(ans);
		}

		writer.flush();
		writer.close();
		reader.close();
	}

}
