package right;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class Demo6 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static int n, q;

	private static Map<Integer, Integer> map = new HashMap<>();
	private static TreeSet<Integer> set = new TreeSet<>();
	private static List<Integer> list;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;

			for (int i = 0; i < n; i++) {
				st.nextToken();
				int a = (int) st.nval;
				st.nextToken();
				int b = (int) st.nval;
				set.add(a);
				map.put(a, Math.max(map.getOrDefault(a, 0), b));
			}
			list = new ArrayList<>(set);
			int tempMax = 0;
			for (Integer key : list) {
				tempMax = Math.max(tempMax, map.get(key));
				map.put(key, tempMax);
			}

			st.nextToken();
			q = (int) st.nval;

			while (q-- > 0) {
				st.nextToken();
				int x = (int) st.nval;
				int l = 0;
				int r = list.size() - 1;
				int ans = -1;
				while (l <= r) {
					int mid = (r - l) / 2 + l;
					if (list.get(mid) <= x) {
						ans = map.get(list.get(mid));
						l = mid + 1;
					} else {
						r = mid - 1;
					}
				}
				writer.println(ans);
			}

		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
