package codeforces_round_1038;

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int m = reader.nextInt();
			if (n == 1 || m == 1 || (n == 2 && m == 2)) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}

		reader.close();
	}

}
