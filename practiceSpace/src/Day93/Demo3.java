package Day93;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int m = reader.nextInt();
		System.out.println(n < m && (n & 1) == 0 ? "YES" : "NO");

		reader.close();
	}

}
