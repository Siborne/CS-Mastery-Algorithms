package Day146;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Demo1 {

	private static final int MAXN = (int) 5e2 + 10;
	private static final int MAXM = (int) MAXN * MAXN + MAXN;

	private static int[][] edges = new int[MAXM][3];

	private static int[] father = new int[MAXN];
	private static int[] size = new int[MAXN];
	private static int[] stack = new int[MAXN];

	private static int n, m;
	private static int cnt;

	private static void build() {
		cnt = 0;
		for (int i = 0; i <= n; i++) {
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

	private static int SOURCE;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			m = (int) st.nval;
			st.nextToken();
			n = (int) st.nval;

			SOURCE = n;
			build();

			for (int i = 0; i < n; i++, cnt++) {
				edges[cnt][0] = SOURCE;
				edges[cnt][1] = i;
				edges[cnt][2] = m;
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++, cnt++) {
					st.nextToken();
					int k = (int) st.nval;
					if (i < j && k > 0) {
						edges[cnt][0] = i;
						edges[cnt][1] = j;
						edges[cnt][2] = k;
					}
				}
			}
			Arrays.sort(edges, 0, cnt, (a, b) -> a[2] - b[2]);
			int ans = 0;
			for (int[] edge : edges) {
				if (union(edge[0], edge[1])) {
					ans += edge[2];
				}
			}
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
