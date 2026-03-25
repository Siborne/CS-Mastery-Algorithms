package Day93;

import java.util.Scanner;

public class Demo25 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int ans = 0;
		for (int i = 1; i <= n / 2 + 1; i++) {
			if (n % i == 0) {
				ans += i;
			}
		}

		System.out.println(ans);
		reader.close();
	}

}
