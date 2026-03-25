package aaa;

import java.util.Scanner;

public class T2 {

	private static int[] arr;
	private static int[] brr;

	private static void init(int n) {
		arr = new int[n + 1];
		brr = new int[n + 1];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
			brr[i] = 1;
		}
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int q = reader.nextInt();
		init(n);
		while (q-- > 0) {
			int op = reader.nextInt();
			int x = reader.nextInt();
			int y = reader.nextInt();
			if (op == 1) {
				union(x, y);
			} else {
				if (find(x) == find(y)) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}
		reader.close();
	}

	private static int find(int x) {
		if (x != arr[x]) {
			arr[x] = find(arr[x]);
		}
		return arr[x];
	}

	private static void union(int x, int y) {
		int rootX = find(x);
		int rootY = find(y);
		if (rootX == rootY) {
			return;
		}
		if (brr[rootX] > brr[rootY]) {
			brr[rootX] += brr[rootY];
			arr[rootY] = rootX;
		} else {
			brr[rootY] += brr[rootX];
			arr[rootX] = rootY;
		}
	}

}
