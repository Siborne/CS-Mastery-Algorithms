package Day42;

import java.util.Scanner;

public class Demo2 {

	private static long ans;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = 30;
		int m = 50;
		char[][] chs = new char[n][m];
		for (int i = 0; i < n; i++) {
			chs[i] = reader.nextLine().toCharArray();
		}
		getAns(chs, n, m);
		System.out.println(ans);
		reader.close();
	}

	private static void getAns(char[][] chs, int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				char c = chs[i][j];
				for (int newCol = j + 1; newCol < m; newCol++) {
					if (c < chs[i][newCol]) {
						ans++;
					}
				}

				for (int newRow = i + 1; newRow < n; newRow++) {
					if (c < chs[newRow][j]) {
						ans++;
					}
				}

				for (int newRow = i + 1, newCol = j + 1; newRow < n && newCol < m; newRow++, newCol++) {
					if (c < chs[newRow][newCol]) {
						ans++;
					}
				}
				
				for (int newRow = i + 1, newCol = j - 1; newRow < n && newCol >= 0; newRow++, newCol--) {
					if (c < chs[newRow][newCol]) {
						ans++;
					}
				}

				for (int newRow = i - 1, newCol = j + 1; newRow >= 0 && newCol < m; newRow--, newCol++) {
					if (c < chs[newRow][newCol]) {
						ans++;
					}
				}
			}
		}
	}

}
