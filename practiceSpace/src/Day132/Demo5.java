package Day132;

import java.util.Scanner;

public class Demo5 {

	private static final int MAXN = 21;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		long[][] C = new long[MAXN][MAXN];
		for (int i = 0; i < MAXN; i++) {
			C[i][0] = 1;
			C[i][i] = 1;
			for (int j = 1; j < i; j++) {
				C[i][j] = C[i - 1][j] + C[i - 1][j - 1];
			}
		}

		long[] D = new long[MAXN];

		D[0] = 1;
		D[1] = 0;
		D[2] = 1;
		for (int i = 3; i < MAXN; i++) {
			D[i] = (i - 1) * (D[i - 1] + D[i - 2]);
		}

		int c = reader.nextInt();
		while (c-- > 0) {
			int N = reader.nextInt();
			int M = reader.nextInt();
			long ans = C[N][M] * D[M];
			System.out.println(ans);
		}

		reader.close();
	}

}
