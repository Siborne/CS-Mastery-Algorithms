package class061;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Code05_BusyCities {

	private static final int MAXN = (int) 3e2 + 1;
	private static final int MAXM = (int) 8e3 + 1;

	private static int[] father = new int[MAXN];
	private static int[] size = new int[MAXN];

	private static int[][] edges = new int[MAXM][3];
	private static int n, m;

	private static int[] stack = new int[MAXN];

	private static void build() {
		for (int i = 1; i <= n; i++) {
			father[i] = i;
			size[i] = 1;
		}
	}

	private static int find(int x) {
		int size = 0;
		while (x != father[x]) {
			stack[size++] = x;
			x = father[x];
		}
		while (size > 0) {
			father[stack[--size]] = x;
		}
		return x;
	}

	private static boolean union(int x, int y) {
		int fx = find(x);
		int fy = find(y);
		if (fx == fy) {
			return false;
		}
		if (size[fx] > size[fy]) {
			size[fx] += size[fy];
			father[fy] = fx;
		} else {
			size[fy] += size[fx];
			father[fx] = fy;
		}
		return true;
	}

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			m = (int) st.nval;
			build();
			for (int i = 0; i < m; i++) {
				st.nextToken();
				edges[i][0] = (int) st.nval;
				st.nextToken();
				edges[i][1] = (int) st.nval;
				st.nextToken();
				edges[i][2] = (int) st.nval;
			}
			Arrays.sort(edges, 0, m, (a, b) -> a[2] - b[2]);
			int ans = 0;
			int edgeCnt = 0;
			for (int[] edge : edges) {
				if (union(edge[0], edge[1])) {
					edgeCnt++;
					ans = Math.max(ans, edge[2]);
				}
				if (edgeCnt == n - 1) {
					break;
				}
			}
			writer.println(edgeCnt + " " + ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
