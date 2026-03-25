package class051;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Code03_RobotPassThroughBuilding {

	private static int MAXN = 100001;
	private static int[] arr = new int[MAXN];
	private static int n;

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			int l = 0;
			int r = 0;
			for (int i = 1; i <= n; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
				r = Math.max(r, arr[i]);
			}
			writer.println(compute(l, r, r));
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static int compute(int l, int r, int max) {
		int m, ans = -1;
		while (l <= r) {
			m = l + ((r - l) >> 1);
			if (f(m, max)) {
				ans = m;
				r = m - 1;
			} else {
				l = m + 1;
			}
		}
		return ans;
	}

	private static boolean f(int energy, int max) {
		for (int i = 1; i <= n; i++) {
			if (energy <= arr[i]) {
				energy -= arr[i] - energy;
			} else {
				energy += energy - arr[i];
			}
			if (energy >= max) {
				return true;
			}
			if (energy < 0) {
				return false;
			}
		}
		return true;
	}

}
