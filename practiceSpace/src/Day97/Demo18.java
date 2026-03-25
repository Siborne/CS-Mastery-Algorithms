package Day97;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Demo18 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));
	private static int n, w, t;
	private static long ans;
	private static PriorityQueue<Integer> queue;
	private static List<int[]> list;

	public static void main(String[] args) throws IOException {

		while (st.nextToken() != StreamTokenizer.TT_EOF) {
//		st.nextToken();
			n = (int) st.nval;
			list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				st.nextToken();
				w = (int) st.nval;
				st.nextToken();
				t = (int) st.nval;
				list.add(new int[] { w, t });
			}
			Collections.sort(list, (o1, o2) -> o1[1] - o2[1]);
			queue = new PriorityQueue<>((o1, o2) -> Integer.compare(o1, o2));
			for (int i = 0; i < n; i++) {
				int[] a = list.get(i);
				if (a[1] > queue.size()) {
					queue.add(a[0]);
				} else {
					if (a[0] > queue.peek()) {
						queue.poll();
						queue.add(a[0]);
					}
				}
			}
			for (int i : queue) {
				ans += i;
			}
			writer.println(ans);
		}

		writer.flush();
		writer.close();
		reader.close();
	}

	private static class Fruit {
		private int w;
		private int t;

		private Fruit(int w, int t) {
			this.w = w;
			this.t = t;
		}
	}

}
