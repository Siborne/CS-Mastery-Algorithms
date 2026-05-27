package week3.day6;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class T3 {

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

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		init(n);

		int[] arr = new int[n + 1];
		st = new StringTokenizer(reader.readLine());
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 1; i <= n; i++) {
			union(i, arr[i]);
		}

		int ans = 0;
		for (int i = 1; i <= n; i++) {
			if (find(i) == i) {
				ans = Math.max(ans, size[i]);
			}
		}

		for (int i = 1; i < n; i++) {
			int root1 = find(i);
			int root2 = find(i + 1);

			if (root1 != root2) {
				ans = Math.max(ans, size[root1] + size[root2]);
			}
		}
		writer.println(ans);
		writer.flush();
		writer.close();
		reader.close();
	}
}
