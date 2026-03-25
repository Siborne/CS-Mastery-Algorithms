package Day120;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Demo4 {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StringTokenizer st;
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static int N, L, M;
	private static Map<String, Set<Integer>> map = new HashMap<>();

	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(reader.readLine());
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(reader.readLine());
			L = Integer.parseInt(st.nextToken());
			while (L-- > 0) {
				String word = st.nextToken();
				Set<Integer> set = map.getOrDefault(word, new HashSet<>());
				set.add(i);
				map.put(word, set);
			}
		}
		M = Integer.parseInt(reader.readLine());
		while (M-- > 0) {
			String key = reader.readLine();
			Set<Integer> set = map.getOrDefault(key, new HashSet<>());
			List<Integer> list = new ArrayList<Integer>(set);
			Collections.sort(list);
			StringBuilder sb = new StringBuilder();
			for (int i : list) {
				sb.append(i).append(" ");
			}
			writer.println(sb.toString().trim());
		}

		writer.flush();
		writer.close();
		reader.close();
	}
}
