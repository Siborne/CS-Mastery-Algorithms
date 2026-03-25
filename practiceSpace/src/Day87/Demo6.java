package Day87;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		long n = reader.nextInt();
		long x = reader.nextInt();
		long ans = 0;
		for (long i = 1; i <= n; i++) {
			if (!(x % i != 0) && n * i >= x) {
				ans++;
			}
		}
		System.out.println(ans);
		reader.close();
	}

}
