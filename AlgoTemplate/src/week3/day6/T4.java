package week3.day6;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.HashSet;
import java.util.Set;

public class T4 {

	private static int[] father;
	private static int[] size;
	private static int ans;

	private static void init(int n) {
		father = new int[n + 1];
		size = new int[n + 1];
		ans = 0;
		for (int i = 1; i <= n; i++) {
			father[i] = i;
			size[i] = 1;
		}
	}

	private static int find(int x) {
		if (father[x] != x) {
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
		if (size[fx] >= size[fy]) {
			father[fy] = fx;
			size[fx] += size[fy];
		} else {
			father[fx] = fy;
			size[fy] += size[fx];
		}

	}

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static int n, m;
	private static int x, y;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			if (n == 0) {
				break;
			}
			st.nextToken();
			m = (int) st.nval;
			init(n);
			while (m-- > 0) {
				st.nextToken();
				x = (int) st.nval;
				st.nextToken();
				y = (int) st.nval;
				union(x, y);
			}

			Set<Integer> set = new HashSet<>();
			for (int i = 1; i <= n; i++) {
				set.add(find(i));
			}
			ans = set.size() - 1;
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}
}
