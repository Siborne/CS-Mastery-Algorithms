package Day93;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		System.out.println(n > 9 && n < 100 ? "YES" : "NO");

		reader.close();
	}

}
