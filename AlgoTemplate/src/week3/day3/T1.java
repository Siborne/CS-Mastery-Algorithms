package week3.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T1 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			Map<Integer, Integer> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				st.nextToken();
				int x = (int) st.nval;
				map.put(x, map.getOrDefault(x, 0) + 1);
			}

			List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

			Collections.sort(list, (a, b) -> {
				if (!a.getValue().equals(b.getValue())) {
					return Integer.compare(b.getValue(), a.getValue());
				}
				return Integer.compare(a.getKey(), b.getKey());
			});

			for (Map.Entry<Integer, Integer> entry : list) {
				writer.println(entry.getKey() + " " + entry.getValue());
			}

		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
