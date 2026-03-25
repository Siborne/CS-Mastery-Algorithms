package Day97;

import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		System.out.println(n % 3 == 0 ? "YES" : "NO");

		reader.close();
	}

}
