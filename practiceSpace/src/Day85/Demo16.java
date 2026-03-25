package Day85;

import java.util.Scanner;

public class Demo16 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int m = reader.nextInt();
		int[][] p = new int[m][m];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				p[i][j] = reader.nextInt();
			}
		}
		for (int i = 1; i < n; i++) {
			int[][] q = new int[m][m];
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < m; k++) {
					q[j][k] = reader.nextInt();
				}
			}
			p = compute(m, p, q);
		}

		for (int[] temp : p) {
			for (int x : temp) {
				System.out.print(x + " ");
			}
			System.out.println();
		}

		reader.close();
	}

	private static int[][] compute(int m, int[][] p, int[][] q) {
		int[][] res = new int[m][m];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				int sum = 0;
				for (int k = 0; k < m; k++) {
					sum += p[i][k] * q[k][j];
				}
				res[i][j] = sum % 2;
			}
		}

		return res;
	}

}
