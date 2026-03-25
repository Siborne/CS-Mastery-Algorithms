package s2025;

import java.util.Scanner;

public class T9 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int m = reader.nextInt();
		long[] opCalc = new long[n + 1];
		long[][] arr = new long[n + 1][m + 1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = reader.nextLong();
			}
		}
		int q = reader.nextInt();
		while (q-- > 0) {
			int opt = reader.nextInt();
			int x = reader.nextInt();
			int k = reader.nextInt();
			if (opt == 1) {
				opCalc[x - 1] += k;
			} else if (opt == 2) {
				opCalc[x - 1] -= k;
			}
		}

		for (int i = 0; i < n; i++) {
			long j = opCalc[i];
			while (j < 0) {
				j = (j + m) % m;
//				j+=m;
			}
			for (int count = 0; count < m; count++, j = (j + 1) % m) {
				System.out.print(arr[i][(int) j] + " ");
			}
			System.out.println();

		}

		reader.close();
	}

}
