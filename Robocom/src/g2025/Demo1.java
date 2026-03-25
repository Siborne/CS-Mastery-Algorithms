package g2025;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Demo1 {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static int n, d, k;
	private static long ans, max, temp;

	private static int[] arr;

	private static List<Integer> list;

	private static Map<Integer, Long> map;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
//		st.nextToken();
			n = (int) st.nval;
			st.nextToken();
			d = (int) st.nval;
			st.nextToken();
			k = (int) st.nval;
			arr = new int[d];
			list = new ArrayList<>();
			map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				max = 0;
				for (int j = 0; j < d; j++) {
					st.nextToken();
					arr[j] = (int) st.nval;
				}
				for (int j = k - 1; j < d; j++) {
					temp = arr[j] - arr[j - k + 1];
					for (int l = j-k+1; l < j; l++) {
						if(arr[l+1]-arr[l]<0) {
							temp = 0;
							break;
						}
					}
					max = Math.max(max, temp);
				}
				map.put(i, max);
				ans = Math.max(ans, max);
			}

			for (Entry<Integer, Long> entry : map.entrySet()) {
				int index = entry.getKey() + 1;
				long value = entry.getValue();
				if (value == ans) {
					list.add(index);
				}
			}
			Collections.sort(list);
			writer.println(ans + "/" + k);
			StringBuilder sb = new StringBuilder();
			for (int index : list) {
				sb.append(index).append(" ");
			}
			sb.deleteCharAt(sb.length() - 1);
			writer.println(sb.toString());
		}
		writer.flush();
		writer.close();
		reader.close();
	}
}
