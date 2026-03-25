package g2025;

import java.util.Arrays;
import java.util.Scanner;

public class T13 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int m = reader.nextInt();
		int[] arr = new int[n + 1];
		Arrays.fill(arr, -1);
		while (m-- > 0) {
			int opt = reader.nextInt();
			int x = reader.nextInt();
			int y = reader.nextInt();
			int xz = find(arr, x);
			int yz = find(arr, y);
			if (opt == 1) {
				if (xz == yz) {
					continue;
				}
				if (xz <= yz) {
					arr[x] += yz;
					arr[y] = xz;
				} else {
					arr[y] += xz;
					arr[x] = yz;
				}
			} else if (opt == 2) {
				if (xz == yz) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
		for (int a : arr) {
			System.out.println(a);
		}

		reader.close();
	}

	private static int find(int[] arr, int x) {
		return arr[x] < 0 ? x : find(arr, arr[x]);
	}

}
