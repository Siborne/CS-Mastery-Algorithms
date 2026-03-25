package Day111;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		long n = reader.nextLong();
		long ans = 0;
		for (int i = 2; i * i <= n; i++) {
			while (n % i == 0) {
				ans += i;
				n /= i;
			}
		}

		if (n > 1) {
			ans += n;
		}
		System.out.println(ans);
		reader.close();
	}

}
