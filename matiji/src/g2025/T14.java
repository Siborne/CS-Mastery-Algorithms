package g2025;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.PriorityQueue;

public class T14 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static int T, n, k, max, x, temp;
	private static long sum;
	private static PriorityQueue<Integer> queue;
//	private static int[] arr;

	public static void main(String[] args) throws IOException {
//		while (st.nextToken() != StreamTokenizer.TT_EOF) {
		st.nextToken();
		T = (int) st.nval;
		while (T-- > 0) {

			st.nextToken();
			n = (int) st.nval;
			st.nextToken();
			k = (int) st.nval;
			queue = new PriorityQueue<>((o1, o2) -> Integer.compare(o1, o2));
			max = Integer.MIN_VALUE;
			sum = 0;

			for (int i = 0; i < n; i++) {
				st.nextToken();
				x = (int) st.nval;
				queue.add(x);
				
			}


			while (n-- > k ) {
				queue.poll();
			}
			for (int q : queue) {
				sum += q;
				if (max < x) {
					max = x;
				}
			}
			if (sum - max > max) {
				writer.println("YES");
			} else {
				writer.println("NO");
			}
		}
//		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
