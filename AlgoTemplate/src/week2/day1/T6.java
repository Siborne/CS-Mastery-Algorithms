package week2.day1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Map;

public class T6 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int m = (int) st.nval;
			st.nextToken();
			int x = (int) st.nval;
			int[] arr = new int[n + 1];
			int[] f = new int[n + 1];
			Map<Integer, Integer> first = new HashMap<>();
			for (int i = 1; i < arr.length; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
				Integer prevPos = first.get(arr[i] ^ x);
				if (prevPos != null) {
					f[i] = Math.max(f[i - 1], prevPos);
				} else {
					f[i] = f[i - 1];
				}
				first.put(arr[i], i);
			}

			for (int i = 0; i < m; i++) {
				StringBuilder sb = new StringBuilder();
				st.nextToken();
				int l = (int) st.nval;
				st.nextToken();
				int r = (int) st.nval;
				if (f[r] < l) {
					sb.append("no");
				} else {
					sb.append("yes");
				}
				writer.println(sb.toString());
			}

		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
