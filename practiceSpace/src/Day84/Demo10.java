package Day84;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			long x = reader.nextInt();
			long y = reader.nextInt();
			long a = reader.nextInt();
			long b = reader.nextInt();
			long max = Math.max(x, y);
			long min = Math.min(x, y);
			long ans = 0;
			if (2 * a > b) {
				ans += min * b + (max - min) * a;
			} else {
				ans += a * (x + y);
			}
			System.out.println(ans);
		}

		reader.close();
	}

}
