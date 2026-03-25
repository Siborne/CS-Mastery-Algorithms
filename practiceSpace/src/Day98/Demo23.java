package Day98;

import java.util.Scanner;

public class Demo23 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int a = reader.nextInt();
		int b = reader.nextInt();
		int h1 = reader.nextInt();
		int h2 = reader.nextInt();
		int h = reader.nextInt();
		int n = reader.nextInt();
		int ans = h;
		boolean flag = false;
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = reader.nextInt();
		}
		for (int i = 0; i < n; i++) {
			ans += c[i] - a;
			if (ans <= 0) {
				ans = 0;
				continue;
			}
			if (flag) {
				ans -= b;
				if (ans <= h2) {
					flag = false;
				}
			}
			if (ans > h1) {
				flag = true;
			}
		}
		System.out.println(ans);
		reader.close();
	}

}
