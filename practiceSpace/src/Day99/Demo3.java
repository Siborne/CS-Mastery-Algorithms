package Day99;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();

		long ans = 1;
		long count2 = 0;
		long count5 = 0;
		for (int i = 0; i < n; i++) {
			int a = reader.nextInt();
			while (a > 0 && a % 2 == 0) {
				count2++;
				a /= 2;
			}
			while (a > 0 && a % 5 == 0) {
				count5++;
				a /= 5;
			}
			ans = (ans * a) % 10;
		}
		if (count2 > count5) {
			long diff = count2 - count5;
			for (int i = 0; i < diff; i++) {
				ans = (ans * 2) % 10;
			}
		} else {
			long diff = count5 - count2;
			for (int i = 0; i < diff; i++) {
				ans = (ans * 5) % 10;
			}
		}
		System.out.println(ans);
		reader.close();
	}

}
