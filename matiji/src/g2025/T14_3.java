package g2025;

import java.util.*;
import java.util.Map.Entry;
import java.io.*;

class T14_3 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static int T, n, k, max, x, temp, key, value;
	private static long sum;
	private static Map<Integer, Integer> map;
//	private static int[] arr;
	private static boolean flag;

	public static void main(String[] args) throws IOException {
//		while (st.nextToken() != StreamTokenizer.TT_EOF) {
		st.nextToken();
		T = (int) st.nval;
		while (T-- > 0) {

			st.nextToken();
			n = (int) st.nval;
			st.nextToken();
			k = (int) st.nval;
			map = new HashMap<>();
			flag = false;
			for (int i = 0; i < n; i++) {
				st.nextToken();
				x = (int) st.nval;
				map.put(x, map.getOrDefault(x, 0) + 1);
			}
			for (Entry<Integer, Integer> entry : map.entrySet()) {
				key = entry.getKey();
				value = entry.getValue();
				if (value >= k) {
					if (key * (k - 1) > key) {
						flag = true;
						break;
					}
				}
			}
			if(flag) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
//		}
		writer.flush();
		writer.close();
		reader.close();
	}
}