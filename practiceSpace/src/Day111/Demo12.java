package Day111;

import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int m = reader.nextInt();
		reader.nextLine();
		char[][] chs = new char[n][m];
		for (int i = 0; i < chs.length; i++) {
			chs[i] = reader.nextLine().toCharArray();
		}

		for (int i = n - 1; i >= 0; i--) {
			for (int j = m - 1; j >= 0; j--) {
				System.out.print(chs[i][j]);
			}
			System.out.println();
		}

		reader.close();
	}

}
