package Day82;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		if (n % 2 == 1) {
			System.out.println("-1");
		} else {
			for (int i = 1; i <= n; i += 2) {
				System.out.println((i + 1) + " " + i + " ");
			}
		}

		reader.close();
	}

}
