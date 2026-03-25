package Day130;

import java.util.Arrays;
import java.util.Scanner;

public class Demo4 {

	private static int[] parent;
	private static int[] rank;
	private static int count;

	private static void initUnionFind(int n) {
		parent = new int[n];
		rank = new int[n];
		count = n;

		for (int i = 0; i < n; i++) {
			parent[i] = i;
		}
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int m = reader.nextInt();

		initUnionFind(n);

		while (m-- > 0) {
			int x = reader.nextInt() - 1;
			int y = reader.nextInt() - 1;
			union(x, y);
		}

		System.out.println(count);

		reader.close();
	}

	private static void union(int x, int y) {
		int rootX = find(x);
		int rootY = find(y);
		if (rootX == rootY) {
			return;
		}

		if (rank[rootX] < rank[rootY]) {
			parent[rootX] = rootY;
		} else if (rank[rootX] > rank[rootY]) {
			parent[rootY] = rootX;
		} else {
			parent[rootY] = rootX;
			rank[rootX]++;
		}
		count--;
	}

	private static int find(int x) {
		if (parent[x] != x) {
			parent[x] = find(parent[x]);
		}
		return parent[x];
	}

}
