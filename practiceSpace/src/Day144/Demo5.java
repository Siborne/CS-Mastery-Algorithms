package Day144;

import java.util.Scanner;

public class Demo5 {

	private static char[][] map = new char[120][120];
	private static long l = 0;
	private static int[] ans = new int[8];
	private static int n;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		n = reader.nextInt();
		reader.nextLine();
		for (int i = 1; i <= n; i++) {
			String line = reader.nextLine();
			for (int j = 1; j <= n; j++) {
				map[i][j] = line.charAt(j - 1);
			}
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (map[i][j] == '#') {
					check(i, j);
				}
			}
		}

		for (int i = 0; i < 8; i++) {
			System.out.print(ans[i]);
			if (i % 2 == 1) {
				System.out.println();
			} else {
				System.out.print(" ");
			}
		}

		reader.close();
	}

	private static void check(int x, int y) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (map[i][j] != '#') {
					continue;
				}

				int dx = i - x;
				int dy = j - y;

				int x1 = x + dy;
				int y1 = y - dx;
				int x2 = i + dy;
				int y2 = j - dx;

				if (x1 < 1 || x1 > n || y1 < 1 || y1 > n || x2 < 1 || x2 > n || y2 < 1 || y2 > n) {
					continue;
				}

				if (map[x1][y1] == '#' && map[x2][y2] == '#') {
					long lenSq = (long) dx * dx + (long) dy * dy;
					if (lenSq > l) {
						l = lenSq;
						ans[0] = x;
						ans[1] = y;
						ans[2] = i;
						ans[3] = j;
						ans[4] = x1;
						ans[5] = y1;
						ans[6] = x2;
						ans[7] = y2;
					}
				}
			}
		}
	}

}
