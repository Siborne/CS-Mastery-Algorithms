package Day98;

import java.util.Scanner;

public class Demo16 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int m = reader.nextInt();

		long ans = 0;
		for (int a = n; a <= m; a++) {
			if (a % 8 != 0) {
				ans += a * (a + 1) / 2;
			}
		}

		System.out.println(ans);
		reader.close();
	}

}
