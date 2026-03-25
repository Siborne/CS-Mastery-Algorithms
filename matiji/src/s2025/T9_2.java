package s2025;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class T9_2 {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		long[] optCala = new long[n];
		Arrays.fill(optCala, 0);
		int q = Integer.parseInt(reader.readLine());
		while (q-- > 0) {
			st = new StringTokenizer(reader.readLine());
			int opt = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			long k = Long.parseLong(st.nextToken());
			if (opt == 1) {
				optCala[x - 1] = (optCala[x - 1] + k) % m;
			} else if (opt == 2) {
				optCala[x - 1] = (optCala[x - 1] - k + m) % m;
			}
			/*
			 * if (opt == 1) { optCala[x - 1] += k; } else if (opt == 2) { optCala[x - 1] -=
			 * k; } if (optCala[x - 1] > 0) { optCala[x - 1] = optCala[x - 1] % m; } else if
			 * (optCala[x - 1] < 0) { optCala[x - 1] = m + optCala[x - 1] % m; }
			 */
		}
		for (int i = 0; i < n; i++) {
//			long j = ((optCala[i] + m) + m) % m;
			long j = 0;
			if (optCala[i] > 0) {
				j = optCala[i] % m;
			} else if (optCala[i] < 0) {
				j = m + optCala[i] % m;
			}
			for (int count = 0; count < m; count++, j = (j + 1) % m) {
				System.out.print(arr[i][(int) j] + " ");
			}
			System.out.println();
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
