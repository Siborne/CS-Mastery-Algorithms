package week3.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;

public class T3 {

	private static int n;
	private static List<List<Integer>> dist;
	private static boolean[] vis;
	private static int ans;
	private static int curLen;

	private static void dfs(int u, int cnt) {
		if (curLen >= ans) {
			return;
		}
		if (cnt == n) {
			ans = Math.min(ans, curLen + dist.get(u).get(1));
			return;
		}

		for (int v = 2; v <= n; v++) {
			if (vis[v]) {
				continue;
			}

			vis[v] = true;
			curLen += dist.get(u).get(v);

			dfs(v, cnt + 1);

			vis[v] = false;
			curLen -= dist.get(u).get(v);
		}
	}

	private static void init() {
		ans = Integer.MAX_VALUE;
		curLen = 0;
		dist = new ArrayList<>();
		dist.add(new ArrayList<>());
		vis = new boolean[n + 1];
		vis[1] = true;
	}

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			init();
			for (int i = 1; i <= n; i++) {
				List<Integer> row = new ArrayList<>();
				row.add(0);
				for (int j = 1; j <= n; j++) {
					st.nextToken();
					row.add((int) st.nval);
				}
				dist.add(row);
			}
			dfs(1, 1);
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
