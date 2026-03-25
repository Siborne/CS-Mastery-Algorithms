package Part1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class T1004 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static Map<String, Integer> map = new HashMap<>();
	private static int N, max;
	private static String color;

	public static void main(String[] args) throws IOException {
		while (true) {
			N = Integer.parseInt(reader.readLine());
			if (N == 0) {
				break;
			}
			map.clear();
			max = 0;
			for (int i = 0; i < N; i++) {
				color = reader.readLine();
				map.put(color, map.getOrDefault(color, 0) + 1);
			}

			for (String key : map.keySet()) {
				if (map.get(key) > max) {
					max = map.get(key);
					color = key;
				}
			}
			writer.println(color);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
