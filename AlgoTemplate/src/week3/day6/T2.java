package week3.day6;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class T2 {

	private static int[] father;
	private static int[] size;

	private static void init(int n) {
		father = new int[n + 1];
		size = new int[n + 1];
		for (int i = 0; i <= n; i++) {
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

	private static boolean isSameFather(int x, int y) {
		return find(x) == find(y);
	}
	
	private static int getFatherSize(int x) {
		return size[find(x)];
	}

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		init(n);

		while (m-- > 0) {
			st = new StringTokenizer(reader.readLine());
			String op = st.nextToken();
			if ("C".equals(op)) {
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				union(x, y);
			} else if ("Q1".equals(op)) {
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				writer.println(isSameFather(x, y) ? "Yes" : "No");
			} else if ("Q2".equals(op)) {
				int x = Integer.parseInt(st.nextToken());
				writer.println(getFatherSize(x));
			}
		}

		writer.flush();
		writer.close();
		reader.close();
	}

}
