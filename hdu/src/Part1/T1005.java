package Part1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T1005 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static final int MOD = 7;
	private static int A, B, n, k, ans;
	private static List<Integer> f = new ArrayList<>();
	private static Map<String, Integer> seen = new HashMap<>();

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			A = (int) st.nval;
			st.nextToken();
			B = (int) st.nval;
			st.nextToken();
			n = (int) st.nval;
			if (A == B && B == n && n == 0) {
				break;
			}
			f.clear();
			seen.clear();
			writer.println(solve(A, B, n));
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static int prev1, prev2, val;
	private static String state;

	private static int solve(int A, int B, int n) {
		if (n == 1 || n == 2) {
			return 1; // f(1)=f(2)=1
		}
		f.add(0);
		f.add(1);
		f.add(1);

		int i = 3;
		while (true) {
			prev1 = f.get(i - 1);
			prev2 = f.get(i - 2);
			val = (A * prev1 + B * prev2) % MOD;
			f.add(val);

			state = prev1 + "," + prev2;
			if (seen.containsKey(state)) {
				// 找到循环！！！
				int cycleStart = seen.get(state);
				int cycleLength = i - 1 - cycleStart;
				if (n < cycleLength) {
					return f.get(n);
				} else {
					int offset = (n - cycleStart) % cycleLength;
					return f.get(cycleStart+offset);
				}
			}
			seen.put(state, i-1);
			if(i>=n) {
				return val;
			}
			i++;
		}

	}

}
