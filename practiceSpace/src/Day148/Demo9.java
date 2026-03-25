package Day148;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Demo9 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			Map<Integer, Integer> map = new TreeMap<>((o1, o2) -> Integer.compare(o1, o2));
			for (int i = 0, x; i < n; i++) {
				st.nextToken();
				x = (int) st.nval;
				map.put(x, map.getOrDefault(x, 0) + 1);
			}
			StringBuilder sb = new StringBuilder();
			int ans = 0;
			for (Entry<Integer, Integer> entry : map.entrySet()) {
				int key = entry.getKey();
				int value = entry.getValue();
				if (value==1) {
					sb.append(key).append(" ");
					ans++;
				}
			}
			writer.println(ans);
			writer.println(sb.toString().trim());
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
