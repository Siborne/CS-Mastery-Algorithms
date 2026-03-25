package Day130;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int m = reader.nextInt();
		int r = reader.nextInt();

		int[][] map = new int[105][105];

		for (int i = 0; i < m; i++) {
			int x = reader.nextInt();
			int y = reader.nextInt();
			map[x][y] = 1;
			for (int j = 1; j <= n; j++) {
				for (int j2 = 1; j2 <= n; j2++) {
					double r1 = Math.sqrt(Math.pow(x - j, 2) + Math.pow(y - j2, 2));
					if (r1 <= r) {
						map[j][j2] = 1;
					}
				}
			}
		}
		int ans = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (map[i][j] == 1) {
					ans++;
				}
			}
		}
		System.out.println(ans);
		reader.close();
	}

}
