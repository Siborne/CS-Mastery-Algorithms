package Day103;

import java.util.Scanner;

public class Demo15 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int a = n / 7;
		int b = n % 7;
		if (b > 5) {
			b = 5;
		}
		long ans = a * 5 * 3 + b * 3;
		System.out.println(ans);
		reader.close();
	}

}
