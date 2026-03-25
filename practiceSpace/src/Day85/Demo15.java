package Day85;

import java.util.Scanner;

public class Demo15 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int ans = 0;
		while (n-- > 0) {
			int x = reader.nextInt();
			while (x > 0) {
				ans += x % 10;
				x /= 10;
			}
		}
		System.out.println(ans);

		reader.close();
	}

}
