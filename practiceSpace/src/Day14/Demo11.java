package Day14;

import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int m = reader.nextInt();
		int[][] arr = new int[n + 1][n + 1];
		int[][] brr = new int[n + 2][n + 2];

		while (m-- > 0) {
			int x1 = reader.nextInt();
			int y1 = reader.nextInt();
			int x2 = reader.nextInt();
			int y2 = reader.nextInt();
			brr[x1][y1]++;
			brr[x1][y2 + 1]--;
			brr[x2 + 1][y1]--;
			brr[x2 + 1][y2 + 1]++;
		}
		reader.close();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				arr[i][j] = brr[i][j] + arr[i - 1][j] + arr[i][j - 1] - arr[i - 1][j - 1];
                System.out.print(arr[i][j] % 2);
			}
            System.out.println();
		}
	}
}