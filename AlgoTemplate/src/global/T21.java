package global;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T21 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static int[] size;
	private static int[] father;

	private static int find(int x) {
		if (x != father[x]) {
			father[x] = find(father[x]);
		}
		return father[x];
	}

	private static void union(int x, int y) {
		int fx = find(x);
		int fy = find(y);
		if (fx == fy) {
			return;
		}

		if (size[fx] > size[fy]) {
			size[fx] += size[fy];
			father[fy] = father[fx];
		} else {
			size[fy] += size[fx];
			father[fx] = father[fy];
		}

	}

	private static void init() {
		father = new int[n + m + 2];
		size = new int[n + m + 2];
		for (int i = 0; i < n + m + 2; i++) {
			father[i] = i;
			size[i] = 1;
		}
	}

	private static boolean isFemale(int x) {
		if (x > n + 1) {
			return true;
		}
		return false;
	}

	private static int toIndex(int x) {
		if (x < 0) {
			x = -x + n;
		}
		return x;
	}

	private static int n, m, p, q;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			m = (int) st.nval;
			st.nextToken();
			p = (int) st.nval;
			st.nextToken();
			q = (int) st.nval;
			init();
			for (int i = 0; i < p; i++) {
				st.nextToken();
				int x = (int) st.nval;
				st.nextToken();
				int y = (int) st.nval;
				union(toIndex(x), toIndex(y));
			}

			for (int i = 0; i < q; i++) {
				st.nextToken();
				int x = (int) st.nval;
				st.nextToken();
				int y = (int) st.nval;
				union(toIndex(x), toIndex(y));
			}

			int fatherOfX1 = find(1);
			int fatherOfY1 = find(toIndex(-1));

			writer.println(Math.min(size[fatherOfX1], size[fatherOfY1]));
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
