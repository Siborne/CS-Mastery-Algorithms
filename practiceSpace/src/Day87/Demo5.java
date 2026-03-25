package Day87;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int a = reader.nextInt();
			int b = reader.nextInt();
			int n = reader.nextInt();
			int ans = 0;
			while (a <= n && b <= n) {
				if (a < b) {
					a += b;
				} else {
					b += a;
				}
				ans++;
			}
			System.out.println(ans);
		}

		reader.close();
	}

}
