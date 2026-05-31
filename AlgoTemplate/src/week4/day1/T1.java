package week4.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T1 {

	private static int n;
	private static int x;
	private static int ans;
	private static int[] arr;

	private static void init() {
		ans = 0;
		arr = new int[n];
	}

	private static void dfs(int index, long sum) {
		if (sum >= x) {
			return;
		}
		if (index == n) {
			ans++;
			return;
		}
		dfs(index + 1, sum + arr[index]);
		dfs(index + 1, sum);
	}

	private static void solve() {
		dfs(0, 0);
	}

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			x = (int) st.nval;
			init();
			for (int i = 0; i < n; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
			}
			solve();
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
