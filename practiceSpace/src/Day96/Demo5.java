package Day96;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					cnt++;
					break;
				}
			}
		}
		int ans = n - cnt - 1;
		System.out.println(ans);
		reader.close();
	}

}
