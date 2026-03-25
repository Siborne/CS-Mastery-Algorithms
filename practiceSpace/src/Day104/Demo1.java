package Day104;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int m = reader.nextInt();
		char[][] map = new char[n][];
		reader.nextLine();
		for (int i = 0; i < n; i++) {
			map[i] = reader.nextLine().toCharArray();
		}
		int ans = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < m - 1; j++) {
				if (map[i][j] == '*' && map[i + 1][j] == '*' && map[i][j + 1] == '*' && map[i + 1][j + 1] == '*') {
					ans++;
				}
			}
		}
		System.out.println(ans);
		reader.close();
	}

}
