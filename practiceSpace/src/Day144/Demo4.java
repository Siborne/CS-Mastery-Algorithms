package Day144;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int[][] carpets = new int[n][4];

		for (int i = 0; i < n; i++) {
			carpets[i][0] = reader.nextInt();
			carpets[i][1] = reader.nextInt();
			carpets[i][2] = reader.nextInt();
			carpets[i][3] = reader.nextInt();
		}

		int x = reader.nextInt();
		int y = reader.nextInt();

		int ans = -1;
		for (int i = n - 1; i >= 0; i--) {
			int a = carpets[i][0];
			int b = carpets[i][1];
			int g = carpets[i][2];
			int k = carpets[i][3];

			if (x >= a && x <= a + g && y >= b && y <= b + k) {
				ans = i + 1;
				break;
			}
		}
		System.out.println(ans);
		reader.close();
	}

}
