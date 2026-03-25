package class046;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Map;

public class Code02_LongestSubarraySumEqualsAim {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static final int MAXN = 100001;
	private static final int[] arr = new int[MAXN];
	private static int n, aim;

	private static Map<Integer, Integer> map = new HashMap<>();

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			aim = (int) st.nval;
			for (int i = 0; i < n; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
			}
			writer.println(compute());
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static int compute() {
		map.clear();
		map.put(0, -1);
		int ans = 0;
		for (int i = 0, sum = 0; i < n; i++) {
			sum += arr[i];
			if (map.containsKey(sum - aim)) {
				ans = Math.max(ans, i - map.get(sum - aim));
			}
			if (!map.containsKey(sum)) {
				map.put(sum, i);
			}
		}
		return ans;
	}

}
