package Day98;

import java.util.Scanner;

public class Demo22 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int m = reader.nextInt();
		long ans = 0;
		for (int i = 0; i < m; i++) {
			int temp = n / 3;
			ans += temp;
			n -= temp;
		}
		System.out.println(ans);
		reader.close();
	}

}
