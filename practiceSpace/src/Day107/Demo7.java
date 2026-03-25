package Day107;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Map;

public class Demo7 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static int n, q, op, i, j, k;
	private static Map<Integer, Integer>[] map;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			q = (int) st.nval;
			map = new HashMap[n];
			while (q-- > 0) {
				st.nextToken();
				op = (int) st.nval;
				st.nextToken();
				i = (int) st.nval - 1;
				st.nextToken();
				j = (int) st.nval;
				if (op == 1) {
					st.nextToken();
					k = (int) st.nval;
					if (map[i] == null) {
						map[i] = new HashMap<>();
					}
					if (k == 0) {
						map[i].put(j, 0);
					} else {
						map[i].put(j, map[i].getOrDefault(j, 0) + k);
					}
				} else if (op == 2) {
					writer.println(map[i].get(j));
				}
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
