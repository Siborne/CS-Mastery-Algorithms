package Day86;

import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int m = reader.nextInt();
		int[][] arr = new int[n+1][m+1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				arr[i][j] = reader.nextInt();
			}
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				int sum = 0;
				for (int x = 1; x <= i; x++) {
					for (int y = 1; y <= j; y++) {
						sum += arr[x][y];
					}
				}
				System.out.print((sum / (i * j)) + " ");
			}
			System.out.println();
		}
		reader.close();
	}

}
