package g2025;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class T7 {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static int T, n;
	private static long ans, x, max, temp;
	private static Stack<Long> stack = new Stack<>();

	public static void main(String[] args) throws IOException {
		st.nextToken();
		T = (int) st.nval;
		while (T-- > 0) {
			st.nextToken();
			n = (int) st.nval;
			ans = 0;
			stack.clear();
			for (int i = 0; i < n; i++) {
				st.nextToken();
				x = (long) st.nval;
				while (!stack.isEmpty() && stack.peek() < x) {
					temp = stack.pop();
					max = Math.max(max, temp);
					ans++;
//					writer.println("offer:" + x + ",pop:" + y);
				}
				stack.push(x);
			}

			while (!stack.isEmpty() && max > stack.peek()) {
				stack.pop();
				ans++;
			}
			/*
			 * for (long a : stack) { writer.print(a + " "); } writer.println();
			 */

			writer.println(ans);
		}

		writer.flush();
		writer.close();
		reader.close();
	}

}
