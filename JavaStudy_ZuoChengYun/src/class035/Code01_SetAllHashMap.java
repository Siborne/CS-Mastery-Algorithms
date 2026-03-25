package class035;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Map;

public class Code01_SetAllHashMap {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static int n, op, a, b;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			map.clear();
			setAllValue = 0;
			setAllTime = -1;
			cnt = 0;
			n = (int) st.nval;
			for (int i = 0; i < n; i++) {
				st.nextToken();
				op = (int) st.nval;
				if (op == 1) {
					st.nextToken();
					a = (int) st.nval;
					st.nextToken();
					b = (int) st.nval;
					put(a, b);
				} else if (op == 2) {
					st.nextToken();
					a = (int) st.nval;
					writer.println(get(a));
				} else {
					st.nextToken();
					a = (int) st.nval;
					setAll(a);
				}
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static Map<Integer, int[]> map = new HashMap<>();
	private static int setAllValue;
	private static int setAllTime;
	private static int cnt;

	private static void put(int k, int v) {
		if (map.containsKey(k)) {
			int[] value = map.get(k);
			value[0] = v;
			value[1] = cnt++;
		} else {
			map.put(k, new int[] { v, cnt++ });
		}
	}

	private static void setAll(int v) {
		setAllValue = v;
		setAllTime = cnt++;
	}

	private static int get(int k) {
		if (!map.containsKey(k)) {
			return -1;
		}
		int[] value = map.get(k);
		if (value[1] > setAllTime) {
			return value[0];
		} else {
			return setAllValue;
		}
	}

}
