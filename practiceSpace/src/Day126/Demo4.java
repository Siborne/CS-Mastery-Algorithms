package Day126;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextInt()) {
			int n = reader.nextInt();
			solve(n);
			System.out.println();
		}

		reader.close();
	}

	private static void solve(int n) {
		int[][] triangle = new int[n][n];

		for (int i = 0; i < triangle.length; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					triangle[i][j] = 1;
				} else {
					triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
				}
				sb.append(triangle[i][j]).append(" ");
			}
			System.out.println(sb.toString().trim());
		}
	}

}
