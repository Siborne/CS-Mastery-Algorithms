package class056;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Code02_UnionFindLuogu {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static final int MAXN = (int) 2e5 + 1;
	private static int[] father = new int[MAXN];

	private static int n, m, z, x, y;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			build(n);
			st.nextToken();
			m = (int) st.nval;
			while (m-- > 0) {
				st.nextToken();
				z = (int) st.nval;
				st.nextToken();
				x = (int) st.nval;
				st.nextToken();
				y = (int) st.nval;
				if (z == 1) {
					union(x, y);
				} else {
					if (isSameSet(x, y)) {
						writer.println("Y");
					} else {
						writer.println("N");
					}
				}
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static void build(int n) {
		for (int i = 1; i <= n; i++) {
			father[i] = i;
		}
	}

	private static int find(int x) {
		if (x != father[x]) {
			father[x] = find(father[x]);
		}
		return father[x];
	}

	private static boolean isSameSet(int x, int y) {
		return find(x) == find(y);
	}

	private static void union(int x, int y) {
		int xFather = find(x);
		int yFather = find(y);
		if (xFather == yFather) {
			return;
		}
		father[yFather] = xFather;
		return;
	}

}
