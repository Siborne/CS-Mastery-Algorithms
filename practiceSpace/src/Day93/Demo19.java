package Day93;

import java.util.Scanner;

public class Demo19 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		System.out.println(n % 11 == 0 || n % 13 == 0 ? "YES" : "NO");

		reader.close();
	}

}
