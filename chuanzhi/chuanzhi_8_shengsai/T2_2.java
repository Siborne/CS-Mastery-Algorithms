package chuanzhi_8_shengsai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class T2_2 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(reader.readLine());
		while (T-- > 0) {
			int n = Integer.parseInt(reader.readLine());
			StringTokenizer st = new StringTokenizer(reader.readLine());
			long[] arr = new long[n];
			PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
			for (int i = 0; i < arr.length; i++) {
				pq.add(Long.parseLong(st.nextToken()));
			}
			long ans = 0;
			long max = pq.peek();
			long lastLast = 0;
			long last = 0;
			while (true) {
				if (pq.isEmpty()) {
					break;
				}
				System.out.println("add: "+last+" * "+pq.peek());
				ans += last * pq.peek();
				lastLast = last;
				last = pq.poll();
			}
//			if (n > 2) {
//				ans += max * lastLast;
//			}
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
