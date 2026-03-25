package Day97;

import java.util.Scanner;

public class Demo15 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		for (int i = 0; i < n; i++) {
			reader.nextInt();
		}
		long res = (long) n * (n - 1) / 2;
		System.out.println(res);
		reader.close();
	}

}
