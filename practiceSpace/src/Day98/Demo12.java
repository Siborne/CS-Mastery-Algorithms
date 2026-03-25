package Day98;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo12 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int m = reader.nextInt();
		int n = reader.nextInt();
		String s = reader.next();
		char c = s.charAt(0);
		char[][] mn = new char[m][n];
		reader.nextLine();
		for (int i = 0; i < m; i++) {
			mn[i] = reader.nextLine().toCharArray();
		}

		Set<Character> set = new HashSet<>();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (mn[i][j] == c) {
					int up = i - 1;
					int down = i + 1;
					int right = j + 1;
					int left = j - 1;
					if (up >= 0 && mn[up][j] != mn[i][j] && mn[up][j] != '0') {
						set.add(mn[up][j]);
					}
					if (left >= 0 && mn[i][left] != mn[i][j] && mn[i][left] != '0') {
						set.add(mn[i][left]);
					}
					if (down < m && mn[down][j] != mn[i][j] && mn[down][j] != '0') {
						set.add(mn[down][j]);
					}
					if (right < n && mn[i][right] != mn[i][j] && mn[i][right] != '0') {
						set.add(mn[i][right]);
					}
				}
			}
		}
		System.out.println(set.size());
		reader.close();
	}

}
