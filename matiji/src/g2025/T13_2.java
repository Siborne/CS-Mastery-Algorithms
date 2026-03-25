package g2025;

import java.util.Arrays;
import java.util.Scanner;

public class T13_2 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int m = reader.nextInt();

		int[] arr = new int[n + 1];
		Arrays.fill(arr, -1);

		for (int i = 0; i < m; i++) {
			int opt = reader.nextInt();
			int x = reader.nextInt();
			int y = reader.nextInt();
			if (opt == 1) {
				union(arr, x, y);
			} else if (opt == 2) {
				int x1 = find(arr, x);
				int y1 = find(arr, y);
				if (x1 == y1) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}

		reader.close();
	}

	private static int find(int[] arr, int x) {
		if (arr[x] < 0) {
			return x;
		} else {
			arr[x] = find(arr, arr[x]);
			return arr[x];
		}
	}

	private static void union(int[] arr, int x, int y) {
		int x1 = find(arr, x);
		int y1 = find(arr, y);
		if (x1 == y1) {
			return;
		}
		if (arr[x1] < arr[y1]) {
			arr[x1] += arr[y1];
			arr[y1] = x1;
		} else {
			arr[y1] += arr[x1];
			arr[x1] = y1;
		}
	}

}
