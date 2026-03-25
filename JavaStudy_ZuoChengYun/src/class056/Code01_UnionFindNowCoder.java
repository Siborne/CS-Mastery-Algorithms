package class056;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Code01_UnionFindNowCoder {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static final int MAXN = (int) 1e6 + 1;
	private static int[] father = new int[MAXN];
	private static int[] size = new int[MAXN];
	private static int[] stack = new int[MAXN];

	private static int n, m, opt, x, y;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			build(n);
			st.nextToken();
			m = (int) st.nval;
			while (m-- > 0) {
				st.nextToken();
				opt = (int) st.nval;
				st.nextToken();
				x = (int) st.nval;
				st.nextToken();
				y = (int) st.nval;
				if (opt == 1) {
					if (isSameSet(x, y)) {
						writer.println("Yes");
					} else {
						writer.println("No");
					}
				} else if (opt == 2) {
					union(x, y);
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
			size[i] = 1;
		}
	}

	private static int find(int x) {
		int size = 0;
		while (x != father[x]) {
			stack[size++] = x;
			x = father[x];
		}
		while (size>0) {
			father[stack[--size]] = x;
		}
		return x;
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
		if (size[xFather] > size[yFather]) {
			father[yFather] = xFather;
			size[xFather] += size[yFather];
		} else {
			father[xFather] = yFather;
			size[yFather] += size[xFather];
		}
	}

}
