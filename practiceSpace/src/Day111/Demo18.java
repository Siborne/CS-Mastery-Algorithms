package Day111;

import java.util.Scanner;

public class Demo18 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int m = reader.nextInt();
		for (int i = 0; i < n - 1; i++) {
			System.out.print(1 + " ");
		}
		System.out.println((m - (n - 1)));
		reader.close();
	}

}
