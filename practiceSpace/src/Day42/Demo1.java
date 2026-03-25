package Day42;

import java.util.Scanner;

public class Demo1 {

	private static long ans;
//	private static int[][] dict = {
//			{1,0},{1,1},{1,-1},{0,1},
//			{0,-1},{-1,-1},{-1,0},{-1,1}
//	};
//	private static char[] target;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String target = "LANQIAO";
		char[][] chs = new char[100][100];
		for (int i = 0; i < chs.length; i++) {
			chs[i] = reader.nextLine().toCharArray();
		}

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				for (int dx = -1; dx <= 1; dx++) {
					for (int dy = -1; dy <= 1; dy++) {
						if (dx == 0 && dy == 0) {
							continue;
						}

						if (i + 6 * dx >= 0 && i + 6 * dx < 100 && j + 6 * dy >= 0 && j + 6 * dy < 100) {
							StringBuilder sb = new StringBuilder();
							sb.append(chs[i][j]);
							for (int k = 1; k <= 6; k++) {
								int newX = i + k * dx;
								int newY = j + k * dy;
								sb.append(chs[newX][newY]);
							}
							String res = sb.toString();
//							System.out.println(res);
							if (res.equals(target)) {
								ans++;
							}
						}

					}
				}
			}
		}
		System.out.println(ans);
	}

}
