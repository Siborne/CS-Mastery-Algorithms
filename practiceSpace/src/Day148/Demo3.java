package Day148;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Demo3 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int t = (int) st.nval;
			while (t-- > 0) {
				st.nextToken();
				int n = (int) st.nval;
				st.nextToken();
				int q = (int) st.nval;
				Map<Integer, Integer> map = new HashMap<>();
				for (int i = 0, x; i < n; i++) {
					st.nextToken();
					x = (int) st.nval;
					map.put(x, map.getOrDefault(x, 0) + 1);
				}
				int[] cnt = new int[n + 1];
				for (int freq : map.values()) {
					cnt[freq] += freq;
				}

				for (int i = 1; i <= n; i++) {
					cnt[i] += cnt[i - 1];
				}

				StringBuilder sb = new StringBuilder();
				for (int i = 0, d; i < q; i++) {
					st.nextToken();
					d = (int) st.nval;
					d = Math.min(d, n);
					sb.append(n - cnt[d]).append(" ");
				}
				writer.println(sb.toString());
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
